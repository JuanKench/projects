public class båt extends Fordon implements Printable{
    int dödvikt;
    String sväng;

    public båt(int hastighet, int vikt, int ändrahastighet,int dödvikt, String sväng) {
        super(hastighet, vikt, ändrahastighet);
        this.dödvikt = dödvikt;
        this.sväng = sväng;
    }

    @Override
    public void printMe() {
        System.out.println("jag har en båt");
    }
}
