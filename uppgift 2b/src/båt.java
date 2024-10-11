public class båt extends Fordon{
    int dödvikt;
    String sväng;

    public båt(int hastighet, int vikt, int ändrahastighet,int dödvikt, String sväng) {
        super(hastighet, vikt, ändrahastighet);
        this.dödvikt = dödvikt;
        this.sväng = sväng;
    }
}
