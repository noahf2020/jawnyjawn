public class Employee {
        String name;
        String title;
        int amountOfHours;
        String wage;
    HoursWorkedToday hoursWorkedToday;



    void checkOutCustomers () {
        System.out.println( name + " is checking Out -Customers");
    }

    void clockPunchCard () {
        System.out.println("clocking punch-card");
        hoursWorkedToday.viewShiftHours();

    }



    void checkDeliveries (){
        System.out.println("checking deliveries");

    }



}
