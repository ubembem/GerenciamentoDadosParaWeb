(function () {
  const div = document.getElementById("conteudo-questao");
  div.innerHTML = `
    <h2>Questão 4 - Cabeçalho Authorization em fetch (AJAX)</h2>
    <div class="questao-card">
      <p><strong>Enunciado:</strong> Ao usar <code>fetch</code> para acessar um recurso protegido, como você normalmente passaria um token <code>Bearer</code> de autorização?</p>
      
      <ul style="margin-bottom: 20px;">
        <li>a) <code>fetch(url, { token: "Bearer SEU_TOKEN" })</code></li>
        <li>b) <code>fetch(url, { headers: { "Authorization": "Bearer SEU_TOKEN" } })</code></li>
        <li>c) <code>fetch(url + "?token=Bearer SEU_TOKEN")</code></li>
        <li>d) <code>fetch(url, { authorization: "Bearer SEU_TOKEN" })</code></li>
      </ul>
    </div>
    <button id="btn-resposta-4" class="btn-resposta">Mostrar Resposta</button>
    <div id="resposta-4" class="resposta" style="display:none; margin-top: 10px; background: #eef; padding: 10px; border-radius: 6px;">
        <p><strong>Resposta:</strong></p>
      <p style="margin-bottom: 20px;">
            <strong>b) <code>fetch(url, { headers: { "Authorization": "Bearer SEU_TOKEN" } })</code></strong> ✅
        </p>

      <pre><code>
fetch("https://api.exemplo.com/dados", {
  method: "GET",
  headers: {
    "Authorization": "Bearer SEU_TOKEN"
  }
});
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
