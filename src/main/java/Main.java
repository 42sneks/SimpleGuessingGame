public class Main {

    public void initialize() {

    }

    public static void main(String[] args) {

        Input input = new ScannerInput();
        Output output = new TerminalOutput();
        Guesser player1 = new ComputerGuesser(output);
        Proposer player2 = new ComputerProposer(output);
        TurnCounter turnCounter = new TurnCounterImpl();
        Game game = new GameImpl(output, turnCounter);


        game.playNumberGame(1,100, player1 ,player2);

    }
}

