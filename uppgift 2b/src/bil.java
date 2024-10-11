public class bil extends Fordon {
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

    public String getCarSpecs(){
        return "antalväxlar: " + antalväxlar + "\nväxeln just nu: " + växeljustnu + "\nväxlar:" +växlar;
    }
}
