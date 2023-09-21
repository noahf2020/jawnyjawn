public class Main {
    public static void main(String[] args) {


        Employee employee1 = new Employee();
        HoursWorkedToday hoursWorkedToday1 = new HoursWorkedToday();

        employee1.name  = "Liam";
        employee1.wage  = "9.50";
        hoursWorkedToday1.calculateHourlyWage();
        employee1.clockPunchCard();


    }
}