(function () {
  const div = document.getElementById("conteudo-questao");
  div.innerHTML = `
    <h2>Questão 2 - Acessando atributo prioridade_projeto (DOM)</h2>
    <div class="questao-card">
      <p><strong>Enunciado:</strong> Para obter o valor do elemento &lt;prioridade_projeto&gt; do projeto com <code>id_projeto="PROJ_WEBSITE_CLIENTE"</code> ("Alta") no DOM de midia_v34.xml, qual seria a forma correta, sendo <code>projetoNode</code> a referência ao elemento &lt;projeto&gt;?</p>
      <ul class="alternativas">
        <li>a) <code>projetoNode.getAttribute("prioridade_projeto")</code> <span class="comentario"></span></li>
        <li>b) <code>projetoNode.querySelector("prioridade_projeto").textContent</code></li>
        <li>c) <code>projetoNode.prioridade_projeto.value</code> <span class="comentario"></span></li>
        <li>d) <code>projetoNode.child("prioridade_projeto").text</code> <span class="comentario"></span></li>
      </ul>
    </div>
    <button id="btn-resposta-2" class="btn-resposta">Mostrar Resposta</button>
      <div id="resposta-2" class="resposta" style="display:none; margin-top: 10px; background: #eef; padding: 10px; border-radius: 6px;">
        <p class="resposta-certa"><strong>Resposta correta:</strong> <code>b) projetoNode.querySelector("prioridade_projeto").textContent</code></p>
      </div>
  `
  ;
  const btn = document.getElementById("btn-resposta-2");
  const respostaDiv = document.getElementById("resposta-2");
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
