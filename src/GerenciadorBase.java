import java.util.ArrayList;

public abstract class GerenciadorBase implements Gerenciavel {
    protected ArrayList<Tarefa> tarefas = new ArrayList<>();

    @Override
    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
        System.out.println("Tarefa adicionada: " + tarefa);
    }

    @Override
    public void removerTarefa(Tarefa tarefa) {
        tarefas.remove(tarefa);
        System.out.println("Tarefa removida: " + tarefa);
    }

    public abstract void listarTarefas();
}