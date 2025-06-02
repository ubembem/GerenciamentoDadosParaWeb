(function () {
  const div = document.getElementById("conteudo-questao");
  div.innerHTML = `
    <h2>Questão 10 - Adicionando um movo risco a um projeto (DOM - Manipulação)</h2>
    <div class="questao-card">
      <p><strong>Enunciado:</strong> Descreva os passos para adicionar um novo elemento <code>&lt;risco probabilidade="Média" impacto="Médio"&gt;Mudança de escopo solicitada pelo cliente durante o desenvolvimento.&lt;/risco&gt;</code> dentro de <code>&lt;riscos_identificados&gt;</code> do projeto <code>id_projeto="PROJ_WEBSITE_CLIENTE"</code> no DOM de <code>midia_v34.xml</code>.</p>

      <button id="btn-resposta-10" class="btn-resposta">Mostrar Resposta</button>
      <div id="resposta-10" class="resposta" style="display:none; margin-top: 10px; background: #eef; padding: 10px; border-radius: 6px;">
        Para adicionar o risco, você primeiro localiza o projeto pelo seu ID usando querySelector. Depois, dentro desse projeto, acha o elemento <code>riscos_identificados</code>. Então, cria um novo elemento <code>risco</code>, define os atributos <code>probabilidade</code> e <code>impacto</code>, adiciona o texto do risco e, por fim, insere esse novo elemento dentro de <code>riscos_identificados</code>.
      </div>
    </div>
  `;

  const btn = document.getElementById("btn-resposta-10");
  const respostaDiv = document.getElementById("resposta-10");
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
