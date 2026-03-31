public class GameImpl implements Game{

    private final TurnCounter turnCounter;
    Output output;
    boolean isThisNumberGuessed;

    public GameImpl(Output output, TurnCounter turnCounter) {
        this.output = output;
        this.turnCounter = turnCounter;

    }

    @Override
    public void playNumberGame(int min, int max, Guesser guesser, Proposer proposer) {

    int proposedNumber = proposer.takeNumber(min, max);


        while(!isNumberGuessed()) {
            int guess = guesser.guess(min, max);
            turnCounter.countTurn();
            output.println("Turn used: " + turnCounter.getTurn());
            if(guess > proposedNumber){ //Validate this in seperate interface to avoid if chain! (ChechNumber)
                //Also check if out of chope instead of Players!
                max = guess;
                output.println(Feedback.TOOHIGH.getFeedback());

            }
            if (guess < proposedNumber){
                min = guess;
                output.println(Feedback.TOOLOW.getFeedback());

            }
            if (guess == proposedNumber) {
                isThisNumberGuessed = true;
                output.println(Feedback.CORRECT.getFeedback());
                printTurn();
                break;
            }

        }
    }

    @Override
    public boolean isNumberGuessed() {
        return isThisNumberGuessed;
    }

    public void printTurn(){
        output.println("Number guessed with "+turnCounter.getTurn()+ " turns!");
    }
}
