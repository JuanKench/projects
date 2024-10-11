import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class bil extends Fordon implements Printable{
    int antalväxlar;
    int växeljustnu;
    int växlar;

    public bil(int hastighet, int vikt, int ändrahastighet, int antalväxlar, int växeljustnu, int växlar) {
        super(hastighet, vikt, ändrahastighet);
        this.antalväxlar = antalväxlar;
        this.växeljustnu = växeljustnu;
        this.växlar = växlar;
    }
    public int getAntalväxlar(){
        return antalväxlar;
    }
    public int getVäxeljustnu(){
        return växeljustnu;
    }
    public int getVäxlar(){
        return växlar;
    }
    @Override
    public void printMe() {
        System.out.println(antalväxlar + " " + växeljustnu + " " + växlar);
    }

}
