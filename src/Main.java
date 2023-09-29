import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {





        HoursWorkedToday hoursWorkedToday1 = new HoursWorkedToday(null,"1900","10");
        Employee employee1 = new Employee("liam", "bossman","10", hoursWorkedToday1);
        Delivery delivery1 = new Delivery("Philly", employee1, "10", "B"  );
        hoursWorkedToday1.setEmployee(employee1);

      //
        employee1.checkOutCustomers();
        employee1.clockPunchCard();


    //    delivery1.getdestination();







    }
}