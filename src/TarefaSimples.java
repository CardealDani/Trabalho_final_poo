public class TarefaSimples extends Tarefa {
    public TarefaSimples(String titulo, String descricao, Prioridade prioridade) {
        super(titulo, descricao, prioridade);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Tarefa Simples: ");
        super.exibirDetalhes();
    }
}
