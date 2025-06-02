package Prova 1;

import jakarta.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "projeto")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProjetoPessoalXML {

    // Atributos do elemento <projeto>
    @XmlAttribute(name = "id_projeto")
    private String idProjeto;

    @XmlAttribute(name = "nome_projeto")
    private String nomeProjeto;

    // Elementos filhos
    @XmlElement(name = "descricao_projeto")
    private String descricaoProjeto;

    @XmlElement(name = "status_projeto")
    private String statusProjeto;

    // Lista de tarefas
    @XmlElement(name = "tarefa")
    private List<TarefaXML> tarefas;

    // Construtores, getters e setters
    public ProjetoPessoalXML() {
    }

    public String getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(String idProjeto) {
        this.idProjeto = idProjeto;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public String getDescricaoProjeto() {
        return descricaoProjeto;
    }

    public void setDescricaoProjeto(String descricaoProjeto) {
        this.descricaoProjeto = descricaoProjeto;
    }

    public String getStatusProjeto() {
        return statusProjeto;
    }

    public void setStatusProjeto(String statusProjeto) {
        this.statusProjeto = statusProjeto;
    }

    public List<TarefaXML> getTarefas() {
        return tarefas;
    }

    public void setTarefas(List<TarefaXML> tarefas) {
        this.tarefas = tarefas;
    }
}
