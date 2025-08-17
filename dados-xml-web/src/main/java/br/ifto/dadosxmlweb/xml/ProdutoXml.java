package br.ifto.dadosxmlweb.xml;

import javax.xml.bind.annotation.XmlElement;

public class ProdutoXml {
    private Long id;
    private String nome;
    private String descricao;
    private String preco;
    private String categoria;
    private Integer estoque;

    @XmlElement public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    @XmlElement public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    @XmlElement public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    @XmlElement public String getPreco() { return preco; }
    public void setPreco(String preco) { this.preco = preco; }

    @XmlElement public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    @XmlElement public Integer getEstoque() { return estoque; }
    public void setEstoque(Integer estoque) { this.estoque = estoque; }
}
