import Arrays.ArrayPractice;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        Calculator cl = new Calculator();
        cl.calclulate(10);

        ArrayPractice arp = new ArrayPractice();
        arp.testarray();
    }
}