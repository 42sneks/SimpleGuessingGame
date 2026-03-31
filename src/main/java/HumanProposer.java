public class HumanProposer implements Proposer{


    private final Input input;
    private final String name;
    private int number;

    public HumanProposer(Input input, String name) {
        this.input = input;
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int number() {
        return 0;
    }

    @Override
    public int takeNumber(int min, int max) {
        int proposedNumber = input.ask("Input a number between "+ min + " and " + max );
        if(proposedNumber > max || proposedNumber < min){
            throw new RuntimeException("Number out of scoope!");
        }
        number = proposedNumber;
        return number;
    }

}
