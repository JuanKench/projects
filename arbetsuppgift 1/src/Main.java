public class Main {
    public static void main(String[] args) {

        car sub = new car("007 BND", "Outback", "subaru");
        car volvo = new car("jxa 396", "v70", "Volvo");


        carOwner owner1 = new carOwner("Johan", "läggestavägen 5", 25, sub);
        carOwner owner2 = new carOwner("Filip", "ingenstansvägen 1", 29, volvo);


        System.out.println(owner1);
        System.out.println(owner2);
    }
}