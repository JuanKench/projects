import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Dice {


    public static String createFile(String path) throws IOException {
        Random rn = new Random();
        FileWriter writer = new FileWriter(path);

        for (int i = 0; i <= 1000; i++) {
            int number = rn.nextInt(6) + 1;
            String answer = String.valueOf(number);
            writer.write(answer + "\n");
        }
        return path;
    }
    public static int[] createArray(String path) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String st = reader.readLine();
        int[] array = new int[1000];
        for (int i = 0; st != null; i++){
            System.out.println(st);
            int numb = Integer.parseInt(st);
            array[i] = numb;
            st = reader.readLine();
        }
        return array;
    }
    public static void analyseArray(int[] arr) {
        int[] list = new int[6];
        for (int i = 0; )
    }
}


