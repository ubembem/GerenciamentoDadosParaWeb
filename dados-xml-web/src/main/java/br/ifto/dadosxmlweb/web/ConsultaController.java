package br.ifto.dadosxmlweb.web;

import br.ifto.dadosxmlweb.repository.ClienteRepository;
import br.ifto.dadosxmlweb.repository.ProdutoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ConsultaController {

    private final ProdutoRepository produtoRepository;
    private final ClienteRepository clienteRepository;

    public ConsultaController(ProdutoRepository produtoRepository, ClienteRepository clienteRepository) {
        this.produtoRepository = produtoRepository;
        this.clienteRepository = clienteRepository;
    }

    @GetMapping("/consultar-dados")
    public String consultar(Model model) {
        model.addAttribute("produtos", produtoRepository.findAll());
        model.addAttribute("clientes", clienteRepository.findAll());
        return "consultar";
    }

    @PostMapping("/produtos/{id}/delete")
    public String deleteProduto(@PathVariable Long id) {
        produtoRepository.deleteById(id);
        return "redirect:/consultar-dados";
    }

    @PostMapping("/clientes/{id}/delete")
    public String deleteCliente(@PathVariable Long id) {
        clienteRepository.deleteById(id);
        return "redirect:/consultar-dados";
    }
}
