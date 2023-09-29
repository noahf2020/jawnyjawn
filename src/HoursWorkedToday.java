public class HoursWorkedToday {
    private Employee employee;
    private String startTime;
    private String totalHoursWorked;


    public HoursWorkedToday(Employee employee, String startTime, String totalHoursWorked) {
        this.employee = employee;
        this.startTime = startTime;
        this.totalHoursWorked = totalHoursWorked;
    }

        void viewShiftHours () {
            System.out.println(this.employee + " has worked" + this.totalHoursWorked + " hours");
        }

        void calculateHourlyWage() {
            System.out.println(this.employee + " has earned" + this.totalHoursWorked);

        }


        void updatePunchClock () {
            System.out.println(this.employee + "clocked in at" + this.startTime);

        }
    }


