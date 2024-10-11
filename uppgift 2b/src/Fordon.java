public class Fordon {
    private int hastighet;
    private int vikt;
    private int ändrahastighet;

    public Fordon(int hastighet, int vikt, int ändrahastighet){
        this.hastighet = hastighet;
        this.vikt = vikt;
        this.ändrahastighet = ändrahastighet;
    }
    public int getHastighet(){
        return hastighet;
    }
    public int getVikt(){
        return vikt;
    }
    public int getÄndrahastighet(){
        return ändrahastighet;
    }


    public String toString(){
        return "hastighet: " + hastighet + "\nvikt: " + vikt + "\nändrahastighet: " + ändrahastighet;
    }
}
