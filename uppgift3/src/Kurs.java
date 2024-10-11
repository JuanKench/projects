class Kurs {

    private static Lärare lärare;
    private String subject;
    private int platser;

    public Kurs(String subject, int platser, Lärare namn){
        this.subject = subject;
        this.platser = platser;
    }

    public int getPlatser(){
        return platser;
    }

    public String getSubject(){
        return subject;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }

    public static Lärare getLärare(Lärare lärare1){
        return lärare = lärare1;
    }
    public void setLärare(Lärare lärare){
        this.lärare = lärare;
    }
}