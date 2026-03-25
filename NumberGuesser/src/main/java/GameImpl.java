public class GameImpl implements Game{

    Output output;
    boolean isThisNumberGuessed;

    public GameImpl(Output output) {
        this.output = output;

    }

    @Override
    public void playNumberGame(int min, int max, Guesser guesser, Proposer proposer) {

    int proposedNumber = proposer.takeNumber(min, max);

        while(!isNumberGuessed()) {
            int guess = guesser.guess(min, max);
            if(guess > proposedNumber){ //Validate this in seperate interface to avoid if chain! (ChechNumber)
                //Also check if out of chope instead of Players!
                max = guess;
                output.println("Too high");
            }
            if (guess < proposedNumber){
                min = guess;
                output.println("To low");
            }
            if (guess == proposedNumber) {
                isThisNumberGuessed = true;
                output.println("Succes!");
                break;
            }
        }
    }

    @Override
    public boolean isNumberGuessed() {
        return isThisNumberGuessed;
    }
}
