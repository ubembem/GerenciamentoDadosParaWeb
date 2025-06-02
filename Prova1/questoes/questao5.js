(function () {
  const div = document.getElementById("conteudo-questao");
  div.innerHTML = `
    <h2>Questão 5 - Selecionando tarefas pendentes (DOM)</h2>
    <div class="questao-card">
      <p><strong>Enunciado:</strong> Qual seletor <code>querySelectorAll</code> você usaria, a partir do nó do projeto <code>id_projeto="PROJ_WEBSITE_CLIENTE"</code> (<code>projetoNode</code>), para selecionar todos os elementos <code>&lt;tarefa&gt;</code> que possuem o atributo <code>status_tarefa</code> igual a <code>"Pendente"</code>?</p>

      <ul style="margin-bottom: 20px;">
        <li>a) <code>projetoNode.querySelectorAll("tarefa.Pendente")</code></li>
        <li>b) <code>projetoNode.querySelectorAll("tarefa[status_tarefa='Pendente']")</code></li>
        <li>c) <code>projetoNode.querySelectorAll("status_tarefa[value='Pendente'] &lt; tarefa")</code></li>
        <li>d) <code>projetoNode.querySelectorAll("tarefa:status(Pendente)")</code></li>
      </ul>
    </div>
   <button id="btn-resposta-4" class="btn-resposta">Mostrar Resposta</button>
    <div id="resposta-4" class="resposta" style="display:none; margin-top: 10px; background: #eef; padding: 10px; border-radius: 6px;">
        <p><strong>Resposta:</strong></p>
        <p style="margin-bottom: 20px;">
            <strong>b) <code>projetoNode.querySelectorAll("tarefa[status_tarefa='Pendente']")</code></strong> ✅
        </p>
        <p><strong>Resposta:</strong></p>
        <p style="margin-bottom: 20px;">
            A gente usa um seletor com colchetes para buscar tarefas que tenham o atributo <code>status_tarefa</code> com o valor <code>"Pendente"</code>.
        </p>

        <pre><code>
            // Seleciona todas as tarefas pendentes dentro do projeto
            const tarefasPendentes = projetoNode.querySelectorAll("tarefa[status_tarefa='Pendente']");
        </code></pre>
    </div>
  `;
  const btn = document.getElementById("btn-resposta-4");
  const respostaDiv = document.getElementById("resposta-4");
  btn.addEventListener("click", () => {
    if (respostaDiv.style.display === "none") {
      respostaDiv.style.display = "block";
      btn.textContent = "Ocultar Resposta";
    } else {
      respostaDiv.style.display = "none";
      btn.textContent = "Mostrar Resposta";
    }
  });
})();
