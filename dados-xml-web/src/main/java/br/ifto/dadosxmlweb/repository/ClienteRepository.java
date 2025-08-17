package br.ifto.dadosxmlweb.repository;

import br.ifto.dadosxmlweb.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    boolean existsByEmail(String email);//Adicionado para verificar se os dados do xml já foram integrados.
}
