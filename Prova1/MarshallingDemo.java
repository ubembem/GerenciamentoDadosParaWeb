package Prova 1;

import javax.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import java.util.Arrays;

public class MarshallingDemo {

    public static void main(String[] args) throws Exception {
        // Criar algumas tarefas
        TarefaXML tarefa1 = new TarefaXML();
        tarefa1.setIdTarefa("T001");
        tarefa1.setResponsavel("DevProdutivo");
        tarefa1.setStatusTarefa("Concluída");
        tarefa1.setTituloTarefa("Definir arquitetura");
        tarefa1.setPrazoTarefa("2025-06-10");
        tarefa1.setDependencias(Arrays.asList("T000"));

        TarefaXML tarefa2 = new TarefaXML();
        tarefa2.setIdTarefa("T002");
        tarefa2.setResponsavel("EquipeFrontend");
        tarefa2.setStatusTarefa("Pendente");
        tarefa2.setTituloTarefa("Desenvolver interface");
        tarefa2.setPrazoTarefa("2025-06-20");
        tarefa2.setDependencias(Arrays.asList("T001"));

        // Criar projeto e adicionar tarefas
        ProjetoPessoalXML projeto = new ProjetoPessoalXML();
        projeto.setIdProjeto("PROJ_WEBSITE_CLIENTE");
        projeto.setNomeProjeto("Website Cliente");
        projeto.setDescricaoProjeto("Projeto para criação do site do cliente.");
        projeto.setStatusProjeto("Ativo");
        projeto.setTarefas(Arrays.asList(tarefa1, tarefa2));

        // Fazer o marshalling para XML
        JAXBContext context = JAXBContext.newInstance(ProjetoPessoalXML.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        // Gerar XML para console
        marshaller.marshal(projeto, System.out);
    }
}
