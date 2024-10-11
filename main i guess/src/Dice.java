import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dice {
    public static String createFile(String path) throws IOException {
        FileWriter writer = new FileWriter(path);
        Random rn = new Random();
        for (int i = 0; i < 1000; i++) {
            int answer = rn.nextInt(6) + 1;
            writer.write(answer + "\n");
        }
        writer.close();
        return path;
    }
    public static int[] createArray(String path) throws IOException {
        List numbers = new ArrayList();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    numbers.add(Integer.parseInt(line));
                } catch (NumberFormatException e) {
                    System.err.println("whomp whomp: " + e.getMessage());
                }
            }
        }
        int[] array = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            array[i] = (int) numbers.get(i);
        }
        return array;
    }
    public static int analyseArray(int[] array) {
        int[] a = new int[6];
        for (int num : array) {
            if (num >= 1 && num <= 6) {
                a[num - 1]++;
            }
        }
        int mostCommonNumber = 1;
        int highestA = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > highestA) {
                highestA = a[i];
                mostCommonNumber = i + 1;
            }
        }
        return mostCommonNumber;
    }
    public static void appendMostCommonNumber(String path, int mostCommonNumber) throws IOException {
        FileWriter appendWriter = new FileWriter(path, true);
        appendWriter.write("Det vanligaste numret äzr : " + mostCommonNumber + "\n");
        appendWriter.close();
    }
}