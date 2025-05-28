import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "item")
public class Item {
    private String nome;
    private double preco;

    // Construtor vazio pro JAXB
    public Item() {}

    // Construtor com parâmetros
    public Item(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @XmlElement
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @XmlElement
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public static void main(String[] args) {
        try {
            // Criando um objeto Item
            Item item = new Item("Caderno", 15.99);

            // Configurando o JAXB pra transformar em XML
            JAXBContext context = JAXBContext.newInstance(Item.class);
            Marshaller marshaller = context.createMarshaller();

            // Pra deixar o XML bonitinho, com quebras de linha
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            // Exibindo no console
            marshaller.marshal(item, System.out);
        } catch (Exception e) {
            System.out.println("Deu erro ao gerar o XML: " + e.getMessage());
        }
    }
}