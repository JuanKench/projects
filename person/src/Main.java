public class Main {


    public static void main(String[] args) {
        Person Johan = new Person("Johan", "läggestavägen 5", 25);
        Person newOwner = new Person("Filip ", "ingenstansvägen 2", 29);
        Car Subaru = new Car("Subaru", "007 BND", "Outback", Johan);

        System.out.println("car owner " + Subaru.getOwner().name);
        System.out.println("new car owner is " + newOwner.name);

    }

    class Person {
        String name;
        String address;
        int age;


        public Person(String name, String address, int age) {
            this.name = name;
            this.address = address;
            this.age = age;
        }
    }

    class Car {
        String model;
        String registrationNumber;
        String carModel;
        Person owner;

        public Car(String model, String registrationNumber, String carModel, Person owner) {
            this.model = model;
            this.registrationNumber = registrationNumber;
            this.carModel = carModel;
            this.owner = owner;
        }

        public Person getOwner() {
            return owner;
        }

        public void setOwner(Person newOwner) {
            this.owner = newOwner;
        }
    }
    class CarShop{
        public void sellCar(Car car, Person newOwner){
            car.setOwner(newOwner);
        }
    }
}