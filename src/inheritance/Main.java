package inheritance;

public class Main {
    public static void main(String[] args) {

        Employee E1 = new Employee();
        E1.work();

        Manager E2 = new Manager();
        E2.manages();
        teamLead E3 = new teamLead();
        E3.lead();
        E3.attendmeeting();


    }
}




