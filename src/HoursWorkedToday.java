public class HoursWorkedToday {
    private Employee employee;
    private String startTime;
    private String totalHoursWorked;


    public HoursWorkedToday(Employee employee, String startTime, String totalHoursWorked) {
        this.employee = employee;
        this.startTime = startTime;
        this.totalHoursWorked = totalHoursWorked;
    }
    void setEmployee(Employee Employeed) {
        this.employee = Employeed;
    }


        void viewShiftHours () {
            System.out.println(employee.getName() + " has worked" + this.totalHoursWorked + " hours");
        }

        void calculateHourlyWage() {
            System.out.println(employee.getName() + " has earned" + this.totalHoursWorked);

        }


        void updatePunchClock () {
            System.out.println(employee.getName() + "clocked in at" + this.startTime);

        }


    }


