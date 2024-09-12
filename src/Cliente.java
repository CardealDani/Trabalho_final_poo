public class Cliente extends Usuario {
    public Cliente(String nome, String senha) {
        super(nome, senha);
    }

    @Override
    public void exibirPermissoes() {
        System.out.println("Cliente pode pegar livros emprestados.");
    }
}
