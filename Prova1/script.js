let scriptAtual = null;

function carregarQuestao(numero) {
  const divConteudo = document.getElementById('conteudo-questao');
  divConteudo.innerHTML = 'Carregando...';

  //Remove texto anterior se existir
  if (scriptAtual) {
    document.body.removeChild(scriptAtual);
    scriptAtual = null;
  }

  //Cria e adiciona novo script
  const novoScript = document.createElement('script');
  novoScript.src = `questoes/questao${numero}.js`;
  novoScript.onload = () => {
    console.log(`Questão ${numero} carregada.`);
  };
  novoScript.onerror = () => {
    divConteudo.innerHTML = `<p>Erro ao carregar a Questão ${numero}.</p>`;
  };
  document.body.appendChild(novoScript);
  scriptAtual = novoScript;
}
