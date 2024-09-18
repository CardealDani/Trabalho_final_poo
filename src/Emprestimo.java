import java.util.Date;

public class Emprestimo {
    private Livro livro;
    private Cliente cliente;
    private Date dataEmprestimo;

    public Emprestimo(Livro livro, Cliente cliente, Date dataEmprestimo) {
        this.livro = livro;
        this.cliente = cliente;
        this.dataEmprestimo = dataEmprestimo;
    }

    public void detalhesEmprestimo() {
        System.out.println("Livro: " + livro.getTitulo() + ", Cliente: " + cliente.getNome());
    }
}
