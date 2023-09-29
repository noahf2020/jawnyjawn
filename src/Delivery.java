import java.util.ArrayList;

public class Delivery {
    private ArrayList<Delivery> delivery;
    //Fields
   private String destination;
    private Employee employee;
    private String amountOfPackages;
    private String route;

     public Delivery(String destination, Employee employee, String amountOfPackages, String route ) {
         this.destination = destination;
         this.employee = employee;
         this.amountOfPackages = amountOfPackages;
         this.route = route;
     }

     void getdestination() {
        System.out.println("Today " + this.employee + " is going to "  + this.destination);
        System.out.println();

    }


    void checkAmountOfPackages() {
        System.out.println("I have  " + this.amountOfPackages);
    }

    void checkRoute() {
        System.out.println("My route today is " + this.route);
    }






}

