package polymorphism;

public class OverloadingImpl {

    void greet(){
        System.out.println("Hello");
    }
    void greet(String name){
        System.out.println("Hell0 "+ name+ "!");

    }
    void greet(String name, int times){
        for(int t=0;t<times;t++){
            System.out.println("Hello "+ name);
        }

    }
}
