public class Student {
    int rollNo, marks;
    String name;

    //  parametrized constructor
    Student(int rollNO,int marks,String name) {
        this.rollNo = rollNO;
        this.marks = marks;
        this.name = name;
    }

    //method to diplay student details
    void display() {
        System.out.println("Printing the details of the student :");
        System.out.println("Name:"+ name);
        System.out.println("RollNo: "+ rollNo);
        System.out.println("Marks:"+ marks);
        System.out.println("__________________________");

    }
        public static void main (String[]args){

            // Create 2 students using parameterized constructor
            Student st1 = new Student(11, 99,"Sima");
            Student st2=new Student(12,98,"Mira");

            // Display their info
            st1.display();
            st2.display();
        }
    }
