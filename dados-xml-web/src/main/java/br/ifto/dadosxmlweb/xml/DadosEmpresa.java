package br.ifto.dadosxmlweb.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DadosEmpresa")
public class DadosEmpresa {

    private ProdutosWrapper produtos;
    private ClientesWrapper clientes;

    @XmlElement(name = "Produtos")
    public ProdutosWrapper getProdutos() { return produtos; }
    public void setProdutos(ProdutosWrapper produtos) { this.produtos = produtos; }

    @XmlElement(name = "Clientes")
    public ClientesWrapper getClientes() { return clientes; }
    public void setClientes(ClientesWrapper clientes) { this.clientes = clientes; }
}
