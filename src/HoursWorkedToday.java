public class HoursWorkedToday {
    Employee employee;
    String startTime;
    String totalHoursWorked;




        void viewShiftHours () {

            System.out.println(employee.name + " has worked" + totalHoursWorked + " hours");
        }

        void calculateHourlyWage() {
            System.out.println(employee.name + " has earned" + totalHoursWorked);

        }


        void updatePunchClock () {

        }
    }


