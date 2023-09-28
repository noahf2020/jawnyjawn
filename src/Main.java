import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {




        Employee employee1 = new Employee("liam", "bossman","10","9.50", );
        HoursWorkedToday hoursWorkedToday1 = new HoursWorkedToday();


        Delivery delivery1 = new Delivery("Philly", employee1, "10", "B"  );



        employee1.name  = "Liam";
        employee1.wage  = "9.50";

        employee1.hoursWorkedToday = hoursWorkedToday1;
        hoursWorkedToday1.totalHoursWorked = " 10";
        hoursWorkedToday1.employee = employee1;
        employee1.clockPunchCard();


        delivery1.getdestination();







    }
}