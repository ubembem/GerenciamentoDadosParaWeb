package br.ifto.dadosxmlweb.web;

import br.ifto.dadosxmlweb.model.Produto;
import br.ifto.dadosxmlweb.repository.ProdutoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoRepository repo;

    public ProdutoController(ProdutoRepository repo) { this.repo = repo; }

    @GetMapping("/novo")
    public String formNovo(Model model) {
        model.addAttribute("produto", new Produto());
        model.addAttribute("acao", "Criar");
        return "produto-form";
    }

    @PostMapping("/novo")
    public String criar(@ModelAttribute Produto produto) {
        repo.save(produto);
        return "redirect:/consultar-dados";
    }

    @GetMapping("/{id}/editar")
    public String formEditar(@PathVariable Long id, Model model) {
        Produto p = repo.findById(id).orElseThrow(() -> new IllegalArgumentException("Produto não encontrado"));
        model.addAttribute("produto", p);
        model.addAttribute("acao", "Editar");
        return "produto-form";
    }

    @PostMapping("/{id}/editar")
    public String editar(@PathVariable Long id, @ModelAttribute Produto produto) {
        produto.setId(id);
        repo.save(produto);
        return "redirect:/consultar-dados";
    }
}
