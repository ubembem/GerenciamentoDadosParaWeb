package br.ifto.dadosxmlweb.xml;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

public class ProdutosWrapper {
    private List<ProdutoXml> produto;

    @XmlElement(name = "Produto")
    public List<ProdutoXml> getProduto() { return produto; }
    public void setProduto(List<ProdutoXml> produto) { this.produto = produto; }
}
