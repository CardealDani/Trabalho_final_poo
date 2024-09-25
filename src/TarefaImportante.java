public class TarefaImportante extends Tarefa {
    private Usuario responsavel;

    public TarefaImportante(String titulo, String descricao, Prioridade prioridade, Usuario responsavel) {
        super(titulo, descricao, prioridade);
        this.responsavel = responsavel;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Tarefa Importante com Responsável: ");
        super.exibirDetalhes();
        System.out.println("Responsável: " + responsavel.getNome());
    }
}