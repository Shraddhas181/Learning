package programming;

public class BasicProgramming {

    public static void main(String[] args) {

// Swap two numbers

        int a = 10;
        int b = 20;
        //int c=a;
        a = a + b;

        b = a - b;
        a = a - b;


        System.out.println(a);
        System.out.println(b);

// even odd

        int x = 13;
        if (x % 2 == 0) {
            System.out.println("Given number is even");
        } else {
            System.out.println("Given number is odd");
        }

//Even number
        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {
                if (i == 60) {
                    continue;
                }
                System.out.println(i);

            }


        }//fact
        int c = 10;
        int fact = 1;
//        for(int y=1;y<=c;y++){
//
//        fact*=y;}
        System.out.println("factorial of the given number :" + fact);

// Find largest numbr in array :

        int arr[] = {3, 88, 4, 5, 22, 34, 89, 95, 33, 91, 27};

        int max = arr[0];
        int SecondLargest = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {


              if (max > SecondLargest)
              {
                SecondLargest = max;

       }
                max = arr[i];


            }

          else {
             if(arr[i]>SecondLargest){
                    SecondLargest=arr[i];
                }
            }


        }
        System.out.println(max+ " " +SecondLargest);
    }
}











