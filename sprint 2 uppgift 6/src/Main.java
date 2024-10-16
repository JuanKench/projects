import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("skriv in totala kostnaden ");
            int kost = scan.nextInt();
            System.out.println("skriv in hur mycket du skulle vilja betala ");
            int pengar = scan.nextInt();
            System.out.println(ChangeCalculator.calculateChange(kost, pengar));
        }


    }
}