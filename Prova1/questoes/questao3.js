(function () {
  const div = document.getElementById("conteudo-questao");
  div.innerHTML = `
    <h2>Questão 3 - Alterando o responsável por uma tarefa (DOM)</h2>
    <div class="questao-card">
      <p><strong>Enunciado:</strong> Como você alteraria o valor do atributo <code>responsavel</code> da tarefa com <code>id_tarefa="T003"</code> de "DevProdutivo" para "EquipeFrontend" no objeto DOM?</p>
      
      <p><strong>Resposta:</strong></p>
      <p style="margin-bottom: 20px;">
        A gente usa o método querySelector e passa como seletor a tag tarefa com o atributo id_tarefa="T003", tipo uma busca mesmo e depois usa o método <code>setAttribute</code> para trocar o valor do responsável para "EquipeFrontend".
      </p>

      <pre><code>
// Com o xmlDoc já carregado
const tarefa = xmlDoc.querySelector('tarefa[id_tarefa="T003"]');

if (tarefa) {
  tarefa.setAttribute("responsavel", "EquipeFrontend");
}
      </code></pre>
    </div>
  `;
})();
