import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> catalogo;
    private ArrayList<Usuario> usuarios;
    
    public Biblioteca() {
        this.catalogo = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }
    
    public void adicionarLivro(Livro livro) {
        catalogo.add(livro);
    }
    
    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    
    public void listarUsuarios() {
        for (Usuario usuario : usuarios) {
            System.out.println(usuario.getNome());
        }
    }
    
    public void listarLivros() {
        for (Livro livro : catalogo) {
            System.out.println(livro.getTitulo());
        }
    }
}
