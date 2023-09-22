public class Main {
    public static void main(String[] args) {


        Employee employee1 = new Employee();
        HoursWorkedToday hoursWorkedToday1 = new HoursWorkedToday();

        employee1.name  = "Liam";
        employee1.wage  = "9v.50";
        employee1.hoursWorkedToday = hoursWorkedToday1;
        hoursWorkedToday1.totalHoursWorked = "$10";
        hoursWorkedToday1.employee = employee1;

        employee1.clockPunchCard();


        Delivery delivery1 = new Delivery();
        delivery1.destination = "Philly";
        delivery1.getdestination();


    }
}