package loops;

public class DoWhileLoopPractice {

    //The Java do-while loop is used to iterate a part of the program repeatedly,
    // until the specified condition is true. If the number of iteration is not fixed and
    // you must have to execute the loop at least once, it is recommended to use a do-while loop.

    public static void main(String[] args) {


        int b = 1;
        do {
            System.out.println(b);
            b++;
        }
        while (b < 10);

    }
}