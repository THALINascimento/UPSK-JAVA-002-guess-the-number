
//import java.util.Random;
//import java.util.Scanner;
//public class GuessTheNumberGame { //O jogo será realizado no terminal.Será usado um número aleatório entre 1 e 100 como número secreto.
//    private static final Random random = new Random();
//    private static int targetNumber;
//
//    public static void main(String[] args) {
//        System.out.println("Hello world, JAVA!!!!! que os jogos comecem"); //como reiniciar a partida ? loop ?
//
//            Player humano = new HumanPlayer();
//            humano.setNome("Digite seu nome: ");
//
//            Player computador = new ComputerPlayer();
//            computador.setNome("ComputerPlayer");
//
//            printaTerminal(humano);
//            printaTerminal(computador);
//
//        Scanner scanner = new Scanner(System.in);
//
//            System.out.println("Digite um número de 1 a 100");
//            int num1 = scanner.nextInt();
//            int rand1 = (int) random.nextInt(100) + 1;
//
//            int acertos = 0;
//            if( num1 == rand1){
//                ++acertos;
//            }
//            System.out.println("Fim de jovo! Você acertou: " + acertos);
//        }
//
//public static void printaTerminal(Player player) {
//    System.out.println(player.getNome());
//    System.out.println(player.makeGuess());
//    System.out.println("------------------");
//}
//}

public static void main(String[] args) {
        System.out.println("Hello world, JAVA!!!!!");

        Player humano = new HumanPlayer();
        humano.setNome("Digite seu nome");
        humeno.nextInt()


        Player computador = new ComputerPlayer();
        computador.setNome("Karen");

        printaTerminal(humano);
        printaTerminal(computador);


        }


import java.util.Random;

public class GuessTheNumberGame {
    private static Random random = new Random();
    private static int targetNumber;

    public static void main(String[] args) {
        targetNumber = random.nextInt(100) + 1;
        Player humanPlayer = new HumanPlayer("Thali");
        Player computerPlayer = new ComputerPlayer("Computador");

        Player currentPlayer = humanPlayer;
        while (true) {
            checkGuess(currentPlayer);
            if (currentPlayer.hasGuessed()) {
                displayGameResult(currentPlayer);
                break;
            }
            currentPlayer = (currentPlayer instanceof HumanPlayer) ? computerPlayer : humanPlayer;
        }
    }

    public static void checkGuess(Player player) {
        int guess = player.makeGuess();
        if (guess < targetNumber) {
            System.out.println(player.getName() + " fez a aposta " + guess + " (Muito Baixa)");
        } else if (guess > targetNumber) {
            System.out.println(player.getName() + " fez a aposta " + guess + " (Muito Alta)");
        } else {
            player.setGuessed(true);
        }
    }

    public static void displayGameResult(Player winner) {
        System.out.println("Fim do jogo!");
        System.out.println(winner.getName() + " advinhou o número " + targetNumber + " corretamente!");
        System.out.println("Tentativas de " + winner.getName() + ": " + winner.getGuesses());
    }
}


    public static void printaTerminal(Player player) {
        System.out.println(player.getNome());
        System.out.println(player.makeGuess());
        System.out.println("------------------");
    }
}