public class HumanGuesser implements Guesser{

    private final Input input;
    private final String name;
    private final Output output;

    public HumanGuesser(String name, Input input, Output output) {
        this.name = name;
        this.input = input;
        this.output = output;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int guess(int low, int high) {
        int guessedNumber = input.ask("Enter number between " +low +" and " + high);
        return guessedNumber;
    }
}
