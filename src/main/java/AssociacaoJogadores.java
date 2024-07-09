import java.util.ArrayList;
import java.util.List;

public class AssociacaoJogadores {

    private List<Jogador> jogadores = new ArrayList<>();

    public void inscrever(String nomeJogador, String nomeTime, String nomePais) {
        Time time = TimeFactory.getTime(nomeTime, nomePais);
        Jogador jogador = new Jogador(nomeJogador, time);
        jogadores.add(jogador);
    }

    public List<String> getJogadores() {
        List<String> lista = new ArrayList<String>();
        for (Jogador jogador : this.jogadores) {
            lista.add(jogador.getJogador());
        }
        return lista;
    }
}
