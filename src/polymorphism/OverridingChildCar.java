package polymorphism;

public class OverridingChildCar extends OverridingParentVehicle {
    void start() {
        System.out.println("Car starts with a key");

        // using super keyword
        // calls parent method
        super.start();
    }

}




