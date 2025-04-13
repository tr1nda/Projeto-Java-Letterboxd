public class Livro extends Obras{
    private int paginas;
    private String autor;
    private String editora;

    public Livro(String titulo, String genero, String descricao, int anoLancamento, int paginas, String autor, String editora) {
        super(titulo, genero, descricao, anoLancamento);
        this.paginas = paginas;
        this.autor = autor;
        this.editora = editora;
    }

    public int getPaginas() {
        return paginas;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

}
