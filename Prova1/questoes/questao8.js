(function () {
  const div = document.getElementById("conteudo-questao");
  div.innerHTML = `
    <h2>Questão 8 - Como XMLHttpRequest trata o tipo de resposta para responseXML (Múltipla Escolha - AJAX)</h2>
    <div class="questao-card">
      <p><strong>Enunciado:</strong> Para que a propriedade <code>responseXML</code> de um <code>XMLHttpRequest</code> seja populada corretamente (não nula), qual é a principal condição que a resposta do servidor deve atender?</p>

      <ul>
        <li>a) O status HTTP deve ser exatamente 200.</li>
        <li>b) A resposta deve ser um XML bem formado e o Content-Type deve ser <code>text/xml</code> ou <code>application/xml</code>.</li>
        <li>c) A propriedade <code>responseType</code> do XHR deve ser definida como "xmlstring".</li>
        <li>d) O XML não deve conter DTD ou Schema.</li>
      </ul>

      <button id="btn-resposta-8" class="btn-resposta">Mostrar Resposta</button>
      <div id="resposta-8" class="resposta" style="display:none; margin-top: 10px; background: #eef; padding: 10px; border-radius: 6px;">
        A resposta correta é: <strong>b)</strong> A resposta deve ser um XML bem formado e o Content-Type deve ser <code>text/xml</code> ou <code>application/xml</code>.
      </div>
    </div>
  `;

  const btn = document.getElementById("btn-resposta-8");
  const respostaDiv = document.getElementById("resposta-8");
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
