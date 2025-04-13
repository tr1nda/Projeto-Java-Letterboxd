import java.util.List;

public class Filme extends Obras{
    private List<String> elenco;
    private String diretor;
    private List<String> ondeAssistir;

    public Filme(String titulo, String genero, String descricao, int anoLancamento, List<String> elenco, String diretor, List<String> ondeAssistir) {
        super(titulo, genero, descricao, anoLancamento);
        this.elenco = elenco;
        this.diretor = diretor;
        this.ondeAssistir = ondeAssistir;
    }
}
