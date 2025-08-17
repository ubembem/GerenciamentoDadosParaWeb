package br.ifto.dadosxmlweb.service;

import br.ifto.dadosxmlweb.model.Cliente;
import br.ifto.dadosxmlweb.model.Produto;
import br.ifto.dadosxmlweb.repository.ClienteRepository;
import br.ifto.dadosxmlweb.repository.ProdutoRepository;
import br.ifto.dadosxmlweb.xml.ClienteXml;
import br.ifto.dadosxmlweb.xml.ClientesWrapper;
import br.ifto.dadosxmlweb.xml.DadosEmpresa;
import br.ifto.dadosxmlweb.xml.ProdutoXml;
import br.ifto.dadosxmlweb.xml.ProdutosWrapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.InputStream;

@Service
public class ImportService {

    private final ProdutoRepository produtoRepository;
    private final ClienteRepository clienteRepository;
    private final XmlMapperService mapper;

    public ImportService(ProdutoRepository produtoRepository,
                         ClienteRepository clienteRepository,
                         XmlMapperService mapper) {
        this.produtoRepository = produtoRepository;
        this.clienteRepository = clienteRepository;
        this.mapper = mapper;
    }

    @Transactional
    public void importarXml(InputStream is) throws JAXBException {
        JAXBContext ctx = JAXBContext.newInstance(
                DadosEmpresa.class, ProdutosWrapper.class, ClientesWrapper.class,
                ProdutoXml.class, ClienteXml.class
        );
        DadosEmpresa dados = (DadosEmpresa) ctx.createUnmarshaller().unmarshal(is);

        if (dados.getProdutos() != null && dados.getProdutos().getProduto() != null) {
            for (ProdutoXml p : dados.getProdutos().getProduto()) {
                Produto entity = mapper.toEntity(p);      // NÃO setar id no mapper
                String nome = entity.getNome();
                if (nome != null && !nome.isBlank() && !produtoRepository.existsByNome(nome)) {
                    produtoRepository.save(entity);
                }
            }
        }

        if (dados.getClientes() != null && dados.getClientes().getCliente() != null) {
            for (ClienteXml c : dados.getClientes().getCliente()) {
                Cliente entity = mapper.toEntity(c);      // NÃO setar id no mapper
                String email = entity.getEmail();
                if (email != null && !email.isBlank() && !clienteRepository.existsByEmail(email)) {
                    clienteRepository.save(entity);
                }
            }
        }
    }
}

