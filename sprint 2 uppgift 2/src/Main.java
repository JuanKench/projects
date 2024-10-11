import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String input1 = JOptionPane.showInputDialog("vad stod mätarinställningen på?");
        double meterSettingYear = Integer.parseInt(input1);

        String input2 = JOptionPane.showInputDialog("vad står mätarinställningen på nu?");
        double meterSetting = Integer.parseInt(input2);

        String input3 = JOptionPane.showInputDialog("hur mycket tankade du?");
        double fuel = Integer.parseInt(input3);

        Car sub = new Car(meterSetting, meterSettingYear, fuel);
        CarMath math = new CarMath();

        double distansDriven = math.distance(sub);
        double fuelConsuptions = math.fuelUse(sub);

        JOptionPane.showMessageDialog(null, "antalet körda mil " + distansDriven);
        JOptionPane.showMessageDialog(null, "bränsle förbrukning per mil " + fuelConsuptions + " liter/mil");
    }
}