import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class  {
    public static void maincreatefile(String[] args) throws IOException {
        Random rn = new Random();
        try {
            FileWriter writer = new FileWriter("en_textfil");

            for (int i = 0; i <= 1000; i++) {
                int awnser = rn.nextInt(6) + 1;
                writer.write(awnser);
            }
            System.out.println("idk");
        }
        catch(IOException e) {
            System.err.println("an error ocured ye fcking biget");
            e.printStackTrace();
        }

        }
    }
