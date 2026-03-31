import java.util.Scanner;

public class ScannerInput implements Input {

    private static Scanner scanner = new Scanner(System.in);


    @Override
    public int ask(String question) {
        IO.print(question + ">");
        return scanner.nextInt();
    }
}
