public class tåg extends Fordon implements Printable{

    int antalvagnar;
    String koplavagn;

    public tåg(int hastighet, int vikt, int ändrahastighet, int antalvagnar , String koplavagn) {
        super(hastighet, vikt, ändrahastighet);
        this.antalvagnar = antalvagnar;
        this.koplavagn = koplavagn;

    }

    @Override
    public void printMe() {
        System.out.println("jag är ett tåg");
    }
}
