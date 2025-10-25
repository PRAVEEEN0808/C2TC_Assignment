package assignment5;

import java.util.*;


class TicketBooking {
 private String stageEvent;
 private String customer;
 private Integer noOfSeats;

 
 public TicketBooking() {}


 public TicketBooking(String stageEvent, String customer, Integer noOfSeats) {
     this.stageEvent = stageEvent;
     this.customer = customer;
     this.noOfSeats = noOfSeats;
 }

 
 public String getStageEvent() { return stageEvent; }
 public void setStageEvent(String stageEvent) { this.stageEvent = stageEvent; }

 public String getCustomer() { return customer; }
 public void setCustomer(String customer) { this.customer = customer; }

 public Integer getNoOfSeats() { return noOfSeats; }
 public void setNoOfSeats(Integer noOfSeats) { this.noOfSeats = noOfSeats; }

 
 public void makePayment(double amount) {
     System.out.printf("Stage event:%s\nCustomer:%s\nNumber of seats:%d\n", stageEvent, customer, noOfSeats);
     System.out.printf("Amount %.1f paid in cash\n", amount);
 }


 public void makePayment(double amount, String walletNumber) {
     System.out.printf("Stage event:%s\nCustomer:%s\nNumber of seats:%d\n", stageEvent, customer, noOfSeats);
     System.out.printf("Amount %.1f paid using wallet number %s\n", amount, walletNumber);
 }

 
 public void makePayment(String holderName, double amount, String creditCardType, String ccv) {
     System.out.printf("Stage event:%s\nCustomer:%s\nNumber of seats:%d\n", stageEvent, customer, noOfSeats);
     System.out.printf("Holder name:%s\n", holderName);
     System.out.printf("Amount %.1f paid using %s card\n", amount, creditCardType);
     System.out.printf("CCV:%s\n", ccv);
 }
}
public class ticketBooking {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     
     String bookingInput = sc.nextLine();
     String[] parts = bookingInput.split(",");

     String stageEvent = parts[0];
     String customer = parts[1];
     int noOfSeats = Integer.parseInt(parts[2]);

     TicketBooking booking = new TicketBooking(stageEvent, customer, noOfSeats);

     int choice = sc.nextInt();
     sc.nextLine(); 

     switch (choice) {
         case 1: 
             double amount1 = sc.nextDouble();
             booking.makePayment(amount1);
             break;

         case 2: 
             double amount2 = sc.nextDouble();
             sc.nextLine(); 
             String walletNumber = sc.nextLine();
             booking.makePayment(amount2, walletNumber);
             break;

         case 3: 
             String holderName = sc.nextLine();
             double amount3 = sc.nextDouble();
             sc.nextLine(); 
             String cardType = sc.nextLine();
             String ccv = sc.nextLine();
             booking.makePayment(holderName, amount3, cardType, ccv);
             break;

         default:
             System.out.println("Invalid choice");
     }
 }
}

