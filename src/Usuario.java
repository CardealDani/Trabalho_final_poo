public class Usuario {
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void criarTarefa(Gerenciavel gerenciador, String titulo, String descricao, Prioridade prioridade) {
        Tarefa tarefa = new TarefaSimples(titulo, descricao, prioridade);
        gerenciador.adicionarTarefa(tarefa);
    }
}