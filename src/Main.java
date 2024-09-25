public class Main {
    public static void main(String[] args) {
        // Criando o Gerenciador de Tarefas
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();

        // Criando usuários
        Usuario usuario1 = new Usuario("Caca");
        Usuario usuario2 = new Usuario("Junior");

        // Criando e adicionando tarefas
        usuario1.criarTarefa(gerenciador, "Estudar POO", "Estudar conceitos de POO", Prioridade.ALTA);
        usuario2.criarTarefa(gerenciador, "Finalizar Projeto", "Trabalho final de POO", Prioridade.MEDIA);

        // Criando uma tarefa importante com responsável
        TarefaImportante tarefaImportante = new TarefaImportante("Apresentar Projeto",
                "Apresentação do projeto de POO", Prioridade.ALTA, usuario1);
        gerenciador.adicionarTarefa(tarefaImportante);

        // Listar todas as tarefas
        System.out.println("Tarefas no sistema:");
        gerenciador.listarTarefas();

        // Polimorfismo - exibindo detalhes das tarefas
        System.out.println("\nExibindo detalhes de uma tarefa com polimorfismo:");
        tarefaImportante.exibirDetalhes();

        // Remover uma tarefa
        Tarefa tarefaRemover = new TarefaSimples("Estudar POO", "Estudar conceitos de POO", Prioridade.ALTA);
            gerenciador.removerTarefa(tarefaRemover);

        // Listar tarefas após a remoção
        System.out.println("\nTarefas restantes no sistema após remoção:");
        gerenciador.listarTarefas();

        // Exibir o número total de tarefas criadas
        System.out.println("\nTotal de tarefas criadas: " + GerenciadorTarefas.getTotalTarefas());
    }
}
