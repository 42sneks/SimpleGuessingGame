public interface Game {


    void playNumberGame(int min, int max, Guesser guesser, Proposer proposer);
boolean isNumberGuessed();
}
