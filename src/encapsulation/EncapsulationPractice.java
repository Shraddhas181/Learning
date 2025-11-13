package encapsulation;

//Encapsulation means:
//
//Keep the data safe inside a class and control how it is accessed.
//2. How to Do Encapsulation in Java
//Make class variables private.
//Provide public methods to get and set values

//Variables are usually private.
//We use getters to read the value.
//We use setters to change the value.

public class EncapsulationPractice {

    public static void main(String [] args){
        Student s = new Student();

        s.x=10;
        s.getAge();
        s.getName();

        System.out.println("Name: " + s.getName());  // get value
        System.out.println("Age: " + s.getAge());
    }
}
