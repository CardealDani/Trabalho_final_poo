public class Tarefa {
    private String titulo;
    private String descricao;
    private Prioridade prioridade;

    public Tarefa(String titulo, String descricao, Prioridade prioridade) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prioridade = prioridade;
    }

    public void exibirDetalhes() {
        System.out.println("Tarefa: " + titulo + " - " + descricao);
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }
}