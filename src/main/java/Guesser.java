public interface Guesser extends Player{

    String name();
    int guess(int low, int high);
}
