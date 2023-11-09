import java.util.Random;
public class ComputerPlayer extends Player{
    private static Random random = new Random();

    public ComputerPlayer(String name) {
        super(name);

    @Override
    public Integer makeGuess() {
        return random.nextInt(100) + 1;
        guesses.add(guess);
        return guess;
    }
}
