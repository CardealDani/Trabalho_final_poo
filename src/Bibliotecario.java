public class Bibliotecario extends Usuario implements Gerenciavel {
    public Bibliotecario(String nome, String senha) {
        super(nome, senha);
    }

    @Override
    public void exibirPermissoes() {
        System.out.println("Bibliotecário pode gerenciar livros e usuários.");
    }

    @Override
    public void adicionarLivro(Livro livro) {
        System.out.println("Livro " + livro.getTitulo() + " adicionado ao catálogo.");
    }

    @Override
    public void removerLivro(Livro livro) {
        System.out.println("Livro " + livro.getTitulo() + " removido do catálogo.");
    }
}
