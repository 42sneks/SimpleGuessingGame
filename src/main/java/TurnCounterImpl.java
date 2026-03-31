public class TurnCounterImpl implements TurnCounter{

    int turn = 0;

    public TurnCounterImpl() {

    }

    @Override
    public void countTurn(){;
        turn ++;
    }

    @Override
    public int getTurn() {
        return turn;
    }


}
