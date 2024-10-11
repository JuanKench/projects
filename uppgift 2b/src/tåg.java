public class tåg extends Fordon{

    int antalvagnar;
    String koplavagn;

    public tåg(int hastighet, int vikt, int ändrahasatighet, int antalvagnar , String koplavagn) {
        super(hastighet, vikt, ändrahastighet);
        this.antalvagnar = antalvagnar;
        this.koplavagn = koplavagn;

    }
}
