import java.text.Collator;
import java.util.*;
import javax.swing.*;

public class dude {
    public static void main(String[] args){
        JOptionPane.showConfirmDialog(null,"hej hej välkomen till fönster bygg max. du vill köpa ett nytt fönster.\n det kommer kosta beroende på några specifikationer \n t.ex. bredden höjden och arean");
        String bredd = JOptionPane.showInputDialog("hur bret vill du ha ditt fönster? \n vi mäter ändast i meter tyvär!\nskriv . istället för ,");
        String höjd = JOptionPane.showInputDialog("hur långt vill du att ditt fönster ska vara? \n igen komihåg att vi räknar i meter! \nskriv . istället för ,");
        String areapris = JOptionPane.showInputDialog("vänta nu ska du bestäma priset per kvadrat meter? \n obs kr/m2 \nskriv . istället för,");
        double breddParse = Double.parseDouble(bredd);
        double höjdParse = Double.parseDouble(höjd);
        double areaprisParse = Double.parseDouble(areapris);
        double kostnad = breddParse * höjdParse * areaprisParse;
        //jag gillar \n sägtill om jag borde ändra det så man inte behöver en ultrawhide schärm för att läsa koden
        if (kostnad > 5000){
            JOptionPane.showConfirmDialog(null,"bredd = " + bredd + " m" + "\nhöjd = " + höjd + " m" + "\npris per kvadratmeter = " + areapris + " kr" + "\n ursprunglig kostnad = " + kostnad + " kr" + "\n rabbat 25% \n slutkostnad = " + kostnad*0.75 + " kr");
        }
        else if (kostnad > 2500){
            JOptionPane.showConfirmDialog(null, "bredd = " + bredd + " m" + "\nhöjd = " + höjd + " m" + "\npris per kvadratmeter = " + areapris + " kr" + "\n ursprunglig kostnad = " + kostnad + " kr" + "\n rabbat 10% \n slutkostnad = " + kostnad*0.90 + " kr");
        }
        else if (kostnad > 1500){
            JOptionPane.showConfirmDialog(null, "bredd = " + bredd + " m" + "\nhöjd = " + höjd + " m" + "\npris per kvadratmeter = " + areapris + " kr" + "\n ursprunglig kostnad = " + kostnad + " kr" + "\n rabbat 5% \n slutkostnad = " + kostnad*0.95 + " kr");
        }
        else {
            JOptionPane.showConfirmDialog(null,"bredd = " + bredd + " m" + "\nhöjd = " + höjd + " m" + "\npris per kvadratmeter = " + areapris + " kr" + "\n ursprunglig kostnad = " + kostnad + " kr" + "\n slutkostnad = " + kostnad + " kr");
        }
    }
}
//kommer sluta skriva på svenska