public class Main {
    public static void main(String[] args) {


        Employee employee1 = new Employee();
        HoursWorkedToday hoursWorkedToday1 = new HoursWorkedToday();

        employee1.name  = "Liam";
        employee1.wage  = "9.50";
        employee1.hoursWorkedToday = hoursWorkedToday1;
        hoursWorkedToday1.totalHoursWorked = "10";

        employee1.clockPunchCard();


    }
}