public class person{

    private static double moms = 25.5;

    private int age;

    private String person;

    private double price;

    public void seValues(String namn, int age){
        this.age = age;
        this.person = namn;
        this.price = this.price * moms;
    }
    public static int sum(int a, int b){
        return a + b;
    }
}
