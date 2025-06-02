(function () {
  const xmlString = `
<projetos>
  <projeto id_projeto="PROJ_WEBSITE_CLIENTE">
    <descricao_projeto>Website do Cliente</descricao_projeto>
    <tarefa id_tarefa="T001" status_tarefa="Concluída" data_conclusao_real="2025-06-01">
      <titulo_tarefa>Definir arquitetura</titulo_tarefa>
      <notas>Revisar padrões usados.</notas>
    </tarefa>
  </projeto>
</projetos>`;

  // Transformar a string XML em um documento DOM
  const parser = new DOMParser();
  const xmlDoc = parser.parseFromString(xmlString, "application/xml");

  // Inserir o enunciado e explicação na div principal
  const div = document.getElementById("conteudo-questao");
  div.innerHTML = `
    <h2>Questão 7 - Obtendo detalhes de uma tarefa concluída (DOM)</h2>
    <div class="questao-card">
      <p><strong>Enunciado:</strong> Como você acessaria a tarefa com <code>id_tarefa="T001"</code> do projeto <code>id_projeto="PROJ_WEBSITE_CLIENTE"</code> e exibiria seu <code>&lt;titulo_tarefa&gt;</code>, <code>status_tarefa</code>, <code>data_conclusao_real</code> e <code>notas</code> em um <code>&lt;div id="info-tarefa-T001-v34"&gt;</code>?</p>

      <p><strong>Explicação:</strong></p>
      <p>Primeiro devemos usar o querySelector para achar o projeto pelo ID, e depois, dentro dele, procurar a tarefa também pelo ID; aí é só pegar os dados e mostrar na div.</p>

      <pre><code>
const projeto = xmlDoc.querySelector('projeto[id_projeto="PROJ_WEBSITE_CLIENTE"]');
const tarefa = projeto.querySelector('tarefa[id_tarefa="T001"]');

if (tarefa) {
  const titulo = tarefa.querySelector("titulo_tarefa")?.textContent;
  const status = tarefa.getAttribute("status_tarefa");
  const dataConclusao = tarefa.getAttribute("data_conclusao_real");
  const notas = tarefa.querySelector("notas")?.textContent;

  const infoDiv = document.getElementById("info-tarefa-T001-v34");
  infoDiv.innerHTML = \`
    <p><strong>Título:</strong> \${titulo}</p>
    <p><strong>Status:</strong> \${status}</p>
    <p><strong>Data de Conclusão:</strong> \${dataConclusao}</p>
    <p><strong>Notas:</strong> \${notas}</p>
  \`;
}
      </code></pre>

      <p><strong>Exibição esperada no HTML:</strong></p>
      <div id="info-tarefa-T001-v34" style="margin-top: 10px; background: #f9f9f9; padding: 10px; border-radius: 8px;">
        <!-- Conteúdo inserido dinamicamente pelo script -->
      </div>
    </div>
  `;

  // Agora inserir os dados reais da tarefa no div info-tarefa-T001-v34
  const projeto = xmlDoc.querySelector('projeto[id_projeto="PROJ_WEBSITE_CLIENTE"]');
  const tarefa = projeto.querySelector('tarefa[id_tarefa="T001"]');

  if (tarefa) {
    const titulo = tarefa.querySelector("titulo_tarefa")?.textContent;
    const status = tarefa.getAttribute("status_tarefa");
    const dataConclusao = tarefa.getAttribute("data_conclusao_real");
    const notas = tarefa.querySelector("notas")?.textContent;

    const infoDiv = document.getElementById("info-tarefa-T001-v34");
    infoDiv.innerHTML = `
      <p><strong>Título:</strong> ${titulo}</p>
      <p><strong>Status:</strong> ${status}</p>
      <p><strong>Data de Conclusão:</strong> ${dataConclusao}</p>
      <p><strong>Notas:</strong> ${notas}</p>
    `;
  }
})();
