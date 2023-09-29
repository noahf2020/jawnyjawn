public class Employee {
       private String name;
      private  String title;

      private  String wage;
    private HoursWorkedToday hoursWorkedToday;

    public Employee(String name, String title, String wage, HoursWorkedToday hoursWorkedToday) {
        this.name = name;
        this.title = title;
        this.wage = wage;
        this.hoursWorkedToday = hoursWorkedToday;
    }
    String getName() {
        return this.name;
    }

    void setName(String newName) {
        this.name = newName;
    }


    void checkOutCustomers () {
        System.out.println( this.name + " is checking Out -Customers");
    }

    void clockPunchCard () {
        System.out.println("clocking punch-card");
        this.hoursWorkedToday.viewShiftHours();

    }



    void checkDeliveries (){
        System.out.println("checking deliveries");

    }



}
