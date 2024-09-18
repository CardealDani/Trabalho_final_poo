public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Cliente cliente = new Cliente("Ana Carolina", "1234");
        Bibliotecario bibliotecario = new Bibliotecario("Cardeal", "admin");

        biblioteca.adicionarUsuario(cliente);
        biblioteca.adicionarUsuario(bibliotecario);

        biblioteca.listarUsuarios();

        Livro livro = new Livro("Programação Orientada a Objeto", "Autor Gilvan");

        bibliotecario.adicionarLivro(livro);  // Adiciona o livro ao catálogo
        bibliotecario.removerLivro(livro);    // Remove o livro do catálogo
        
        // Polimorfismo
        cliente.exibirPermissoes();
        bibliotecario.exibirPermissoes();
    }
}
