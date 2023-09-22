public class Main {
    public static void main(String[] args) {


        Employee employee1 = new Employee();
        HoursWorkedToday hoursWorkedToday1 = new HoursWorkedToday();
        Delivery delivery1 = new Delivery();

        employee1.name  = "Liam";
        employee1.wage  = "9v.50";

        employee1.hoursWorkedToday = hoursWorkedToday1;
        hoursWorkedToday1.totalHoursWorked = " $10";
        hoursWorkedToday1.employee = employee1;
        employee1.clockPunchCard();



        delivery1.destination = "Philly";
        delivery1.getdestination();


    }
}