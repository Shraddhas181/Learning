package polymorphism;





// Definition ::
// Polymorphism means taking many forms , that means same action behaving differently in differnet situation.
// There are two ways to acheive polymorphism
// 1. Method Overloading (aka comile time polymorphism aka static binding aka Early binding) - within class
// Method overloading is when two or more methods in the same class have the same name but different parameters (different type, number, or both).
// 2. Method Overriding (aka runtime time polymorphism aka dynamic binding aka Late binding) - between parent and child class
// Method overriding occurs when a subclass provides its own implementation of a method that is already defined in its superclass.

// ######## Method Overloading Rules ###########
//  • Same method name but different parameter list:
//	• Different number of parameters
//	• Different types of parameters
//	• Different order of parameters
//  • Return type can be different, but it cannot be the only difference:
//  • Method overloading happens at compile-time (known as compile-time polymorphism).
//  • Access modifiers can be different (private, public, etc.) – allowed.
//  • Static and instance methods can be overloaded.
//  Varargs can be used in overloading, but can cause ambiguity if not careful:

// ######### Method Overriding Rules ###########
// Same method signature is mandatory:
// Same method name
// Same parameter list
// Same return type (or covariant return type – more on this below)
// Return Type:
// Must be same as superclass method or a subclass of the return type (covariant return).
// Static Methods Cannot Be Overridden

public class PolymorphismDemo {

   public static void main(String[] args) {


       // Example for Overloading
       OverloadingImpl ov1=new OverloadingImpl();
       ov1.greet();
       ov1.greet("ABS");
       ov1.greet("ABS",5);

       // Example for Overriding

       // Create object of parent
       OverridingParentVehicle v1= new OverridingParentVehicle();
       v1.start();

       //Create object of parent
       OverridingParentVehicle v2= new OverridingChildCar();
       v2.start();
       v2.horn();








   }


}
