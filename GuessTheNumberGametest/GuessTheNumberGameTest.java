import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import java.util.Collections;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class GuessTheNumberGameTest {

    @Test
    @DisplayName("Deve retornar falso quando o jogador vence o jogo")
    void testCheckGuessVencedor() {
        GuessTheNumberGame game = new GuessTheNumberGame(new Random());
        game.targetNumber = 50;

        HumanPlayer mockHumanPlayer = mock(HumanPlayer.class);
        when(mockHumanPlayer.getName()).thenReturn("Thali");
        when(mockHumanPlayer.makeGuess()).thenReturn(50);

        boolean resultado = game.chekGuess(mockHumanPlayer);

        assertFalse(resultado);
    }


    @Test
    @DisplayName("Deve retornar verdadeiro quando a tentativa for menor que o alvo")
    void testCheckGuessMenorQueAlvo() {
        GuessTheNumberGame game = new GuessTheNumberGame(new Random());
        game.targetNumber = 50;

        HumanPlayer mockHumanPlayer = mock(HumanPlayer.class);
        when(mockHumanPlayer.makeGuess()).thenReturn(40);

        boolean resultado = game.chekGuess(mockHumanPlayer);

        assertTrue(resultado);
    }

    @Test
    @DisplayName("Deve retornar verdadeiro quando a tentativa for maior que o alvo")
    void testCheckGuessMaiorQueAlvo() {
        GuessTheNumberGame game = new GuessTheNumberGame(new Random());
        game.targetNumber = 50;

        HumanPlayer mockHumanPlayer = mock(HumanPlayer.class);
        when(mockHumanPlayer.makeGuess()).thenReturn(60);

        boolean resultado = game.chekGuess(mockHumanPlayer);

        assertTrue(resultado);
      
    }
}

