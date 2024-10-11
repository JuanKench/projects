import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        String p = Dice.createFile("Number.txt");
        int[] arr = Dice.createArray(p);
        Dice.analyseArray(arr);

    }
}