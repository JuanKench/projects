public class Deltagande {
    private Student elev;
    private Kurs kurs;
    public Deltagande(Student elev, Kurs kurs){
        this.elev = elev;
        this.kurs = kurs;
    }
    public String toString(){
        return elev.namn + " går i kursen " + kurs.getSubject();
    }
}