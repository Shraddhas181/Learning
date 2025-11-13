package operator;


// Important operators
// arithmatic : + , - , * , / , %
// logical : ! , || , &&
// unary : ++ , -- , !
// relational : <, >, <=, >=, == , !=
// assignment : = , +=, *= , /=
// ternary : variable = (condition) ? value_if_true : value_if_false;


public class OperatorPractice {

    public static void main(String[] args) {

        int x;
        int y=30;
        int z=10;

        x=5;
        x=x+10;
        x=x+5;
        x=x-5;
        x=y;
        x=y-z;
        x=y%z;
//      x=y/z;
        int p=5;

        System.out.println("value of x:"+x);
// logical operators
if (p >3 || p > 8 && p==5)
{
    System.out.println("true");
}
else
{
    System.out.println("false");
}

if (p > 8 &&  p==5)
{
    System.out.println("true");
 }


// ternary operator.
String s=p>3?"yes":"no";
        System.out.println(s);

//p=p++; //first assign then increment
//p=++p; // first increment then assign
        p++;
System.out.println(p);



    }

}
