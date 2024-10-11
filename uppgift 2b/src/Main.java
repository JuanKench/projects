public class Main {
    public static void main(String[] args){
        bil sub = new bil(0,1600,30, 6, 1, 2);
        Fordon fjord = new båt(0,2500,0,0,"öst");
        Fordon tåg =new tåg(90, 100000, 190, 6, "nej");
        Fordon skrot = new cykel(30,15, 20,3, 2);

        System.out.println(sub.getCarSpecs());
    }
}