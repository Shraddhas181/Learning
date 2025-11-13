package inheritance;

public class Employee {

    void work() {
        System.out.println("Employee is working ");
    }




        public static void main(String[] args) {

            Employee E1 = new Employee();
            E1.work();

            manager E2 = new manager();
            E2.manages();
           teamLead E3 = new teamLead();
            E3.lead();


        }
    }




