package br.ifto.dadosxmlweb.web;

import br.ifto.dadosxmlweb.model.Cliente;
import br.ifto.dadosxmlweb.repository.ClienteRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteRepository repo;

    public ClienteController(ClienteRepository repo) { this.repo = repo; }

    @GetMapping("/novo")
    public String formNovo(Model model) {
        model.addAttribute("cliente", new Cliente());
        model.addAttribute("acao", "Criar");
        return "cliente-form";
    }

    @PostMapping("/novo")
    public String criar(@ModelAttribute Cliente cliente) {
        repo.save(cliente);
        return "redirect:/consultar-dados";
    }

    @GetMapping("/{id}/editar")
    public String formEditar(@PathVariable Long id, Model model) {
        Cliente c = repo.findById(id).orElseThrow(() -> new IllegalArgumentException("Cliente não encontrado"));
        model.addAttribute("cliente", c);
        model.addAttribute("acao", "Editar");
        return "cliente-form";
    }

    @PostMapping("/{id}/editar")
    public String editar(@PathVariable Long id, @ModelAttribute Cliente cliente) {
        cliente.setId(id);
        repo.save(cliente);
        return "redirect:/consultar-dados";
    }
}
