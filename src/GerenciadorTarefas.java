public class GerenciadorTarefas extends GerenciadorBase {
    private static int totalTarefas = 0;

    @Override
    public void adicionarTarefa(Tarefa tarefa) {
        super.adicionarTarefa(tarefa);
        totalTarefas++;
    }

    @Override
    public void listarTarefas() {
        for (Tarefa tarefa : tarefas) {
            tarefa.exibirDetalhes();
        }
    }

    public static int getTotalTarefas() {
        return totalTarefas;
    }
}