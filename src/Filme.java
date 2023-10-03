public class Filme {
    private String nome;

    public Filme(String nome) {
        this.nome = nome;
        Main.filmes.add(this);
    }

    public String getNome() {
        return nome;
    }
}
