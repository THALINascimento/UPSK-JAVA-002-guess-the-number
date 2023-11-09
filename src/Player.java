import java.util.List;
public abstract class Player {
    private String nome;
    private List<Integer> apostas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Integer> getApostas() {
        return apostas;
    }

    public void setApostas(List<Integer> apostas) {
        this.apostas = apostas;
    }

    public abstract Integer makeGuess();
}