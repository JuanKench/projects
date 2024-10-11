class car{
    private String regnumb;
    private String modell;
    private String mark;

    public car(String regnumb, String modell, String mark){
        this.regnumb = regnumb;
        this.modell = modell;
        this.mark = mark;
    }
    public String toString(){
        return " regnummret " + regnumb + " modellen " + modell + " märke " + mark;
    }
}