package Abstraction;


// Rules :
// 1. Use abstract keyword
// 2. Can’t create object(can't instantiate)
// 3. Can have both abstract & normal methods and must have at least one abstract method.
// 4. Can have constructors
// 5 Can have variables
// 6. Subclass must override abstract methods

import java.awt.*;

public class AbstractionDemo {
    public static void main(String[]args){

        // Creating object is called instantiation.


        Dog d= new Dog();
        d.makesound();
        d.sleep();
        d.eat();


// -----------------

       Shape s1= new circle();
        s1.draw();
        Shape s2= new rectangle();
        s2.draw();






    }
}
