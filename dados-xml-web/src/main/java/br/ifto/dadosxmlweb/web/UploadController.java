package br.ifto.dadosxmlweb.web;

import br.ifto.dadosxmlweb.service.ImportService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.xml.bind.JAXBException;
import java.io.IOException;

@Controller
public class UploadController {

    private final ImportService importService;

    public UploadController(ImportService importService) { this.importService = importService; }

    @GetMapping({"/", "/upload"})
    public String uploadPage() {
        return "upload";
    }

    @PostMapping("/upload")
    public String handleUpload(@RequestParam("file") MultipartFile file, Model model) {
        if (file.isEmpty()) {
            model.addAttribute("error", "Envie um arquivo XML.");
            return "upload";
        }
        if (!file.getOriginalFilename().toLowerCase().endsWith(".xml")) {
            model.addAttribute("error", "Arquivo inválido. Envie um .xml.");
            return "upload";
        }
        try {
            importService.importarXml(file.getInputStream());
            model.addAttribute("success", "XML importado com sucesso!");
            model.addAttribute("linkConsulta", "/consultar-dados");
            return "upload";
        } catch (JAXBException e) {
            model.addAttribute("error", "Erro ao interpretar o XML: " + e.getMessage());
            return "upload";
        } catch (IOException e) {
            model.addAttribute("error", "Erro de leitura do arquivo: " + e.getMessage());
            return "upload";
        }
    }
}
