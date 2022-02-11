import java.util.ArrayList;
import java.util.Scanner;

public class Address {
    String city;
    String state;
    String country;
    String street_area;
    int pin_code;
    protected String departure;
    protected String arrival;
    //  String FlightClass;
    String FlightDate;
    int choice;
    String name;
    void show4() {
        Scanner t = new Scanner(System.in);


        System.out.println("Enter Your Full Name");
        name = t.nextLine();
        System.out.println("Enter Your Street Area:");
        street_area = t.nextLine();
        System.out.println("Enter Your Pin_Code:");
        pin_code = t.nextInt();
        System.out.println("Enter city");
        city = t.next();
        System.out.println("Enter State");
        state = t.next();
        System.out.println("Enter Your Country");
        country = t.next();



        System.out.println("Enter Departure Location");
        setDeparture(t.next());
        System.out.println("Enter Arrival Location");
        setArrival(t.next());
//    System.out.println("Enter Flight Ticket Type(Regular & Tourist)");
//    FlightClass = avi.next().toUpperCase();
        System.out.println("Enter Flight Date");
        FlightDate = t.next();
        System.out.println("Enter Output Preference PRESS 1 For \n.Both Fare And Flight Time\n" + " ");
        choice = t.nextInt();
    }
    public void print(){

    }



    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }
}
