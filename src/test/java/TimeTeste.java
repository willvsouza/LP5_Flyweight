import org.junit.jupiter.api.Test;
import java.util.List;
import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeTeste {

    @Test
    void deveRetornarJogadores() {
        AssociacaoJogadores associacaoJogadores = new AssociacaoJogadores();
        associacaoJogadores.inscrever("Nikola Jokic", "Denver Nuggets", "Sérvia");
        associacaoJogadores.inscrever("Luka Doncic", "Dallas Mavericks", "Eslovênia");
        associacaoJogadores.inscrever("LeBron James", "Dallas Mavericks", "Eslovênia");

        List<String> lista = asList(
                "Jogador {Nome jogador: Nikola Jokic - Time: Denver Nuggets - País: Sérvia}",
                "Jogador {Nome jogador: Luka Doncic - Time: Dallas Mavericks - País: Eslovênia}",
                "Jogador {Nome jogador: LeBron James - Time: Dallas Mavericks - País: Eslovênia}");

        assertEquals(lista, associacaoJogadores.getJogadores());
    }

    @Test
    void deveRetornarTotalDeTimes() {
        AssociacaoJogadores associacaoJogadores = new AssociacaoJogadores();
        associacaoJogadores.inscrever("Nikola Jokic", "Denver Nuggets", "Sérvia");
        associacaoJogadores.inscrever("Luka Doncic", "Dallas Mavericks", "Eslovênia");
        associacaoJogadores.inscrever("LeBron James", "Dallas Mavericks", "Eslovênia");
        associacaoJogadores.inscrever("Kevin Durant", "Dallas Mavericks", "Estados Unidos");

        assertEquals(2, TimeFactory.getTotalTimes());
    }


}
