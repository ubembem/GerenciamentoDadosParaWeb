package br.ifto.dadosxmlweb.service;

import br.ifto.dadosxmlweb.model.Cliente;
import br.ifto.dadosxmlweb.model.Produto;
import br.ifto.dadosxmlweb.xml.ClienteXml;
import br.ifto.dadosxmlweb.xml.ProdutoXml;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class XmlMapperService {

    public Produto toEntity(ProdutoXml p) {
        Produto e = new Produto();
        //e.setId(p.getId()); comentei para resolver um erro do banco depois que coloquei para gerar os ids automaticamente
        e.setNome(p.getNome());
        e.setDescricao(p.getDescricao());
        if (p.getPreco() != null && !p.getPreco().isBlank()) {
            e.setPreco(new BigDecimal(p.getPreco().trim()));
        }
        e.setCategoria(p.getCategoria());
        e.setEstoque(p.getEstoque());
        return e;
    }

    public Cliente toEntity(ClienteXml c) {
        Cliente e = new Cliente();
        //e.setId(c.getId()); comentei para resolver um erro do banco depois que coloquei para gerar os ids automaticamente
        e.setNome(c.getNome());
        e.setEmail(c.getEmail());
        e.setEndereco(c.getEndereco());
        e.setTelefone(c.getTelefone());
        return e;
    }
}
