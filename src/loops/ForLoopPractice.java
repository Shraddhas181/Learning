package loops;

public class ForLoopPractice {

 //    Definition:

   // A loop executes a block of code repeatedly until a condition becomes false.

// for(initialization; condition; increment/decrement){

    /// /statement or code to be executed }
    /// For loops in Java are a fundamental control structure used to repeat a block of code a specific number of times or iterate through a sequence of values.

    public static void main(String[]args){

        int a=6;
        int b=1;
        for(int i=1;i<=a;i++){
            b=b*i;
        }
        System.out.println(b);
    }
}
