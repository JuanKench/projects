import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path = "text.txt";

        try {

            Dice.createFile(path);
            int[] numbers = Dice.createArray(path);
            System.out.println("borde komma number från text.txt:");
            for (int number : numbers) {
                System.out.print(number + "\n");
            }
            int mostCommon = Dice.analyseArray(numbers);
            System.out.println("\n Det mest återkommande nummret" + mostCommon);
            Dice.appendMostCommonNumber(path, mostCommon);
        } catch (IOException e) {
            System.err.println("whomp whomp: " + e.getMessage());
        }
    }
}
