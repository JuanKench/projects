class Person{
    private String namn;
    private String address;
    private int age;
    private car ownerCar;

    public Person(String namn, String address, int age, car ownerCar) {
        this.namn = namn;
        this.address = address;
        this.age = age;
        this.ownerCar = ownerCar;
    }

    public String getNamn(){
        return namn;
    }
    public String toString(){
        return "namn " + namn + ", address " + address + ", age " + age + " car " + ownerCar;
    }

}