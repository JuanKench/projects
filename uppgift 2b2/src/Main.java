import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        bil sub = new bil(0,1600,30, 6, 1, 2);
        båt fjord = new båt(0,2500,0,0,"öst");
        tåg tåg = new tåg(90, 100000, 190, 6, "nej");
        cykel skrot = new cykel(30,15, 20,3, 2);

        List<Fordon> FordonList = new ArrayList<>();
        FordonList.add(sub);
        FordonList.add(fjord);
        FordonList.add(tåg);
        FordonList.add(skrot);



        for(int i = 0; i < 1; i++){
            sub.printMe();
            System.out.println(sub);
            fjord.printMe();
            System.out.println(fjord);
            tåg.printMe();
            System.out.println(tåg);
            skrot.printMe();
            System.out.println(skrot);
        }
    }
}