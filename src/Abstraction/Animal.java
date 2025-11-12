package Abstraction;

//Abstract class
abstract class Animal {
 //Abstract method
    abstract void makesound();

  //Normal method
    void sleep(){
        System.out.println("Sleeping");
    }
}

 class  Dog extends Animal{

    void makesound()
   {
       //
   };

    void eat(){
        System.out.println("eating");
    }
}
