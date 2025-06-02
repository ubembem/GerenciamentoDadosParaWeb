(function () {
  const div = document.getElementById("conteudo-questao");
  div.innerHTML = `
    <h2>Questão 9 - Anotação JAXB para lista sem Elemento Wrapper (Múltipla Escolha)</h2>
    <div class="questao-card">
      <p><strong>Enunciado:</strong> Se você tem <code>List&lt;String&gt; membrosEquipe;</code> e quer que no XML os nomes apareçam como <code>&lt;membro&gt;Nome1&lt;/membro&gt;&lt;membro&gt;Nome2&lt;/membro&gt;</code> diretamente sob o elemento pai (sem um <code>&lt;equipe&gt;</code> envolvendo os <code>&lt;membro&gt;</code>), qual anotação é usada no campo membrosEquipe para nomear cada item da lista?</p>

      <ul>
        <li>a) @XmlElementRefs({@XmlElementRef(name="membro")})</li>
        <li>b) @XmlElement(name="membro") (Usado diretamente no campo da lista)</li>
        <li>c) @XmlValue(name="membro")</li>
        <li>d) @XmlTransient</li>
      </ul>

      <button id="btn-resposta-9" class="btn-resposta">Mostrar Resposta</button>
      <div id="resposta-9" class="resposta" style="display:none; margin-top: 10px; background: #eef; padding: 10px; border-radius: 6px;">
        A resposta correta é: <strong>b)</strong> @XmlElement(name="membro") (Usado diretamente no campo da lista).
      </div>
    </div>
  `;

  const btn = document.getElementById("btn-resposta-9");
  const respostaDiv = document.getElementById("resposta-9");
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
