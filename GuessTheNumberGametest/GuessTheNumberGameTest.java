
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

    class GuessTheNumberGameTest {

        @Test
        void testGuessMaiorQueNumeroAlvo() {
            Player jogador = new Player("Jogador1");
            int targetNumber = 42;

            // Cria um mock para o gerador de números
            GeradorDeNumero geradorMock = Mockito.mock(GeradorDeNumero.class);

            // Configura o comportamento simulado para retornar um palpite maior que o número alvo
            Mockito.when(geradorMock.gerarNumero()).thenReturn(50);

            // Substitui o gerador real pelo mock no jogador
            jogador.setGerador(geradorMock);

            boolean resultado = Jogo.checkGuess(jogador, targetNumber, true);

            assertFalse(resultado); // O jogo deve continuar
            assertEquals("Muito alto!", jogador.getLastFeedback()); // Verifica feedback
            assertEquals(1, jogador.getGuess().size()); // Verifica se há uma suposição registrada
        }


        @Test
        void main() {
        }

        @Test
        void chekGuess() {
        }
    }
    }}}}}
