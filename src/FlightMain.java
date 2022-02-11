import java.util.Scanner;

public class FlightMain {
    public static void main(String[] args) {


        Contact t=new Contact();
        RegularTicket t2=new RegularTicket();
        t2.Create_PNR();
        t2.SeatNO();
        t2.setFlight_time("3.22");
        t2.Ac_Details("not available");
        t2.setTicketFare(2000.00f);
        Tourist_Ticket t3=new Tourist_Ticket(" Chicken Cilli","samosa,eggs "," Chilled Water Available");

        t3.Create_PNR();
        t3.SeatNO();
        t3.setFlight_time("4.00");
        t3.Ac_Details("exclusive Available");
        t3.setTicketFare(5000.00f);
        Passenger t4=new Passenger();
        t4.setFlight_name("INDIAN AIRLINE");
        t4.Flight_No();
        t.setArrival(t.arrival);
        t.setDeparture(t.departure);
        t.setFlightDate(t.FlightDate);



        t.show4();

        t4.setName(t.name);
        t4.show1();
        int choice;
        System.out.println("Enter Flight Ticket Type Which you want(For Regular Press 1 & For Tourist Press 2)");
        Scanner m=new Scanner(System.in);
        choice=m.nextInt();
        t.show();


        t.print();



        System.out.println("Date: "+t.getFlightDate());
        System.out.println("Passenger ID: "+t4.AadharCard_No);
        System.out.println();
        System.out.println("||Flight Detail||");
        System.out.print  ( "\t|\t" +" Flight_Name: "+ t4.getFlight_name());
        System.out.print  ( "\t|\t" +"Flight_Number: "+ t4.Flight_No());
        System.out.print  ( "\t|\t" +"Arrival: "+ t.getArrival());
        System.out.println ("\t|\t" +"Departure: "+ t.getDeparture());

        switch (choice) {

            case 1:
                System.out.println("||REGULAR TICKET||");
                System.out.print("\t|\t" + "PNR_NO: " + t2.Create_PNR());
                System.out.print("\t|\t" + "Seat_NO: " + t2.SeatNO());
                System.out.print("\t|\t" + "Time: " + t2.getFlight_time());
                System.out.print("\t|\t" + "AC_Detail: " + t2.getAc_Details());
                System.out.println("\t|\t" + "Fare: " + t2.getTicketFare());
                System.out.println("NOTE: Food Facility Not Available For regular Ticket");
                break;
            case 2:
                System.out.println("||Tourist Ticket||");
                System.out.print("\t|\t" + "PNR_NO: " + t3.Create_PNR());
                System.out.print("\t|\t" + "Seat_NO: " + t3.SeatNO());
                System.out.print("   \t|\t" + "Time: " + t3.getFlight_time());
                System.out.print("\t|\t" + "AC_Detail: " + t3.getAc_Details());
                System.out.println("\t|\t" + "Fare: " + t3.getTicketFare());
                t3.print1();
                break;
            default:
                System.out.println("please enter valid option");
        }



    }
}
