(function () {
  const div = document.getElementById("conteudo-questao");
  div.innerHTML = `<h2>Questão 1 - Listar nome dos projetos e status</h2><div id="lista-projetos-status-v34">Carregando...</div>`;

  fetch('midia_v34.xml')
    .then(response => response.text())
    .then(xmlString => {
      const parser = new DOMParser();
      const xmlDoc = parser.parseFromString(xmlString, "application/xml");

      const projetos = xmlDoc.getElementsByTagName("projeto");
      const listaDiv = document.getElementById("lista-projetos-status-v34");
      listaDiv.innerHTML = "";

      for (let i = 0; i < projetos.length; i++) {
        const nome = projetos[i].getAttribute("nome_projeto");
        const status = projetos[i].getElementsByTagName("status_projeto")[0].textContent;

        const card = document.createElement("div");
        card.className = "projeto-card";

        card.innerHTML = `
          <div class="nome-projeto">${nome}</div>
          <div class="status-projeto">Status: ${status}</div>
        `;

        listaDiv.appendChild(card);
      }
    })
    .catch(() => {
      document.getElementById("lista-projetos-status-v34").textContent = "Erro ao carregar XML.";
    });
})();
