import java.util.Scanner;

public class Main {

    class Elevator {
        int level;

        public Elevator(int startLevel) {
            this.level = startLevel;
        }

        public void goTo(int targetLevel) {
            if (targetLevel > level) {
                System.out.println("Hissen åker upp från våning " + level + " till våning " + targetLevel);
                level = targetLevel;
            } else if (targetLevel < level) {
                System.out.println("Hissen åker ned från våning " + level + " till våning " + targetLevel);
                level = targetLevel;
            } else {
                System.out.println("Hissen är redan på våning " + level);
            }
        }

        public void where() {
            System.out.println("Hissen är nu på våning " + level);
        }
    }

    public static void main(String[] args) {
        Main mainObj = new Main();
        Elevator hiss = mainObj.new Elevator(0);
        Scanner scan = new Scanner(System.in);

        while (true) {
            hiss.where();

            System.out.println("Vilken våning vill du åka till? (huset är från våning 12 till -2 skriv över eller under för att avsluta programet): ");
            int targetLevel = scan.nextInt();
            if (targetLevel < -3 || targetLevel > 13) {
                System.out.println("whomp whomp byggnaden går från 12 till - 2");
                break;
            }

            hiss.goTo(targetLevel);
        }

        scan.close();
    }
}
