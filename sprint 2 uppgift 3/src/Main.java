import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("skriv någonting");
        String input = scan.nextLine();

        for(int i = 0; i < 10;){
            System.out.println("du skrev " + input);
            scan.nextLine();
        }





    }
}