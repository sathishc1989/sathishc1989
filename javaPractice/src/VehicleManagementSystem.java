

abstract class Vehicle {

    String brand;
    int speed;

    abstract void start();


    void displayInfo() {
        System.out.println("brand = " +brand);
        System.out.println("speed=" +speed);
    }
}

    class car extends Vehicle {
        void start() {

            System.out.println("car start by push button");
        }
    }

    class bike extends Vehicle {
        void start() {
            System.out.println("bike start by Kicker");
        }
    }
    public class VehicleManagementSystem {

        public static void main(String[] args) {

            car c = new car();
            c.brand="Hyundai";
            c.speed = 300;
            bike b = new bike();
            b.brand="yamaha";
            b.speed = 135;
            c.start();
            c.displayInfo();
            b.start();
            b.displayInfo();

        }
    }
