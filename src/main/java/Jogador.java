public class Jogador {

    private String nome;
    private Time time;

    public Jogador(String nome, Time time) {
        this.nome = nome;
        this.time = time;
    }

    public String getJogador() {
        return "Jogador {" +
                "Nome jogador: " + this.nome +
                " - Time: " + time.getNome() +
                " - País: " + time.getPais() + "}";
    }
}
