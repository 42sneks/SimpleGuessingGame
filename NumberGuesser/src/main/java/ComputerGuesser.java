public class ComputerGuesser implements Guesser{

    Output output;

    public ComputerGuesser(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "Computer";
    }

    @Override
    public int guess(int low, int high) {
        int guess = (low + high) / 2;
        output.println("Number guessed: " + guess);
        return guess;
    }

}
