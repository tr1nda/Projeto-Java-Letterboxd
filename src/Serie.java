import java.util.List;

public class Serie extends Obras{
    private List<String> elenco;
    private int anoEncerramento;
    private String tituloOriginal;
    private List<String> ondeAssistir;
    private int temporadas;

    public Serie(String titulo, String genero, String descricao, int anoLancamento, List<String> elenco, int anoEncerramento, String tituloOriginal, List<String> ondeAssistir, int temporadas) {
        super(titulo, genero, descricao, anoLancamento);
        this.elenco = elenco;
        this.anoEncerramento = anoEncerramento;
        this.tituloOriginal = tituloOriginal;
        this.ondeAssistir = ondeAssistir;
        this.temporadas = temporadas;
    }
}
