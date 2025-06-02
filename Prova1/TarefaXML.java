import jakarta.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class TarefaXML {

    @XmlAttribute(name = "id_tarefa")
    private String idTarefa;

    @XmlAttribute(name = "responsavel")
    private String responsavel;

    @XmlAttribute(name = "status_tarefa")
    private String statusTarefa;

    // Elementos filhos
    @XmlElement(name = "titulo_tarefa")
    private String tituloTarefa;

    @XmlElement(name = "prazo_tarefa")
    private String prazoTarefa;

    // Lista de strings para <depende_de_tarefa_id> dentro de <dependencias>
    @XmlElementWrapper(name = "dependencias")
    @XmlElement(name = "depende_de_tarefa_id")
    private List<String> dependencias;

    // Construtores, getters e setters
    public TarefaXML() {
    }

    public String getIdTarefa() {
        return idTarefa;
    }

    public void setIdTarefa(String idTarefa) {
        this.idTarefa = idTarefa;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getStatusTarefa() {
        return statusTarefa;
    }

    public void setStatusTarefa(String statusTarefa) {
        this.statusTarefa = statusTarefa;
    }

    public String getTituloTarefa() {
        return tituloTarefa;
    }

    public void setTituloTarefa(String tituloTarefa) {
        this.tituloTarefa = tituloTarefa;
    }

    public String getPrazoTarefa() {
        return prazoTarefa;
    }

    public void setPrazoTarefa(String prazoTarefa) {
        this.prazoTarefa = prazoTarefa;
    }

    public List<String> getDependencias() {
        return dependencias;
    }

    public void setDependencias(List<String> dependencias) {
        this.dependencias = dependencias;
    }
}
