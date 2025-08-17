package br.ifto.dadosxmlweb.repository;

import br.ifto.dadosxmlweb.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    boolean existsByNome(String nome);//Adicionado para verificar se os dados do xml já foram integrados.
}
