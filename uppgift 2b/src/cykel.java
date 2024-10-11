public class cykel extends Fordon{

    int antalväxlar;
    int växeljustnu;

    public cykel(int hastighet, int vikt, int ändrahastighet, int antalväxlar, int växeljustnu) {
        super(hastighet, vikt, ändrahastighet);
        this.antalväxlar = antalväxlar;
        this.växeljustnu = växeljustnu;
    }
}
