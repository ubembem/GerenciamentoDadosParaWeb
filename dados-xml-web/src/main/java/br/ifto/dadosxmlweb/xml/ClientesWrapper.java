package br.ifto.dadosxmlweb.xml;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

public class ClientesWrapper {
    private List<ClienteXml> cliente;

    @XmlElement(name = "Cliente")
    public List<ClienteXml> getCliente() { return cliente; }
    public void setCliente(List<ClienteXml> cliente) { this.cliente = cliente; }
}
