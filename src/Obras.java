public abstract class Obras{
    private final String titulo;
    private final String genero;
    private final String descricao;
    private final int anoLancamento;
    private int nota = 0;

    public Obras(String titulo, String genero, String descricao, int anoLancamento){
        this.titulo = titulo;
        this.genero = genero;
        this.descricao = descricao;
        this.anoLancamento = anoLancamento;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getGenero(){
        return genero;
    }

    public String getDescricao(){
        return descricao;
    }

    public int getAnoLancamento(){
        return anoLancamento;
    }

    public int getNota(){
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}