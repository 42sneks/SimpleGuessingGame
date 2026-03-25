import java.util.function.DoubleToIntFunction;

import static java.lang.Math.random;

public class ComputerProposer implements Proposer{
    int number;
    Output output;

    public ComputerProposer(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "Computer";
    }

    @Override
    public int number() {
        return number;
    }

    @Override
    public int takeNumber(int min, int max) {

        int proposedNumber = (int) (Math.random()* max +1);
        if(proposedNumber > max || proposedNumber < min){
            throw new RuntimeException("Number out of scoope!");
        }
        number = proposedNumber;
        output.println("Number: "  + proposedNumber);
        return proposedNumber;
    }

}
