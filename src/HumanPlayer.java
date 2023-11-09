import java.util.Scanner;
public class HumanPlayer extends Player{


    @Override
    public Integer makeGuess() {
        return 30;
    }
}


//import java.util.Scanner;
//public class HumanPlayer extends Player{
//    @Override
//    public Integer makeGuess() {
//        System.out.println("Digite um número de 1 a 100: ");
//        Scanner scannerHum = new Scanner(System.in);
//        while (true) {
//            try {
//                int guess = scannerHum.nextInt();
//                if (guess >= 1 && guess <= 100) {
//                    return guess;
//                } else {
//                    System.out.println("Número fora do intervalo. Tente novamente.");
//                }
//            } catch (Exception e) {
//                System.out.println("Entrada inválida. Digite um número válido.");
//                scannerHum.nextLine(); // Limpar a entrada inválida
//            }
//        }
//    }}