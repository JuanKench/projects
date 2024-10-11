public class ElevatorTest {

    public static void main(String[] args) {

        Main mainObj = new Main();
        Main.Elevator elevator1 = mainObj.new Elevator(0);
        Main.Elevator elevator2 = mainObj.new Elevator(5);

        // provar första hissen
        System.out.println("Testa elevator1:");
        elevator1.where();
        elevator1.goTo(3);
        elevator1.where();
        elevator1.goTo(7);
        elevator1.where();
        elevator1.goTo(7);

        // provar andar hissen
        System.out.println("\nTesta elevator2:");
        elevator2.where();
        elevator2.goTo(10);
        elevator2.where();
        elevator2.goTo(2);
        elevator2.where();
        elevator2.goTo(2);
    }
}
