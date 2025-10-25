package assignment5;

import java.util.*;

//TicketBooking class
class TicketBooking {
 private String stageEvent;
 private String customer;
 private Integer noOfSeats;

 // Default constructor
 public TicketBooking() {}

 // Parameterized constructor
 public TicketBooking(String stageEvent, String customer, Integer noOfSeats) {
     this.stageEvent = stageEvent;
     this.customer = customer;
     this.noOfSeats = noOfSeats;
 }

 // Getters and Setters
 public String getStageEvent() { return stageEvent; }
 public void setStageEvent(String stageEvent) { this.stageEvent = stageEvent; }

 public String getCustomer() { return customer; }
 public void setCustomer(String customer) { this.customer = customer; }

 public Integer getNoOfSeats() { return noOfSeats; }
 public void setNoOfSeats(Integer noOfSeats) { this.noOfSeats = noOfSeats; }

 // Overloaded methods for different payment modes

 // 1️⃣ Cash payment
 public void makePayment(double amount) {
     System.out.printf("Stage event:%s\nCustomer:%s\nNumber of seats:%d\n", stageEvent, customer, noOfSeats);
     System.out.printf("Amount %.1f paid in cash\n", amount);
 }

 // 2️⃣ Wallet payment
 public void makePayment(double amount, String walletNumber) {
     System.out.printf("Stage event:%s\nCustomer:%s\nNumber of seats:%d\n", stageEvent, customer, noOfSeats);
     System.out.printf("Amount %.1f paid using wallet number %s\n", amount, walletNumber);
 }

 // 3️⃣ Credit card payment
 public void makePayment(String holderName, double amount, String creditCardType, String ccv) {
     System.out.printf("Stage event:%s\nCustomer:%s\nNumber of seats:%d\n", stageEvent, customer, noOfSeats);
     System.out.printf("Holder name:%s\n", holderName);
     System.out.printf("Amount %.1f paid using %s card\n", amount, creditCardType);
     System.out.printf("CCV:%s\n", ccv);
 }
}

//Driver class
public class ticketBooking {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     // Input in CSV format
     String bookingInput = sc.nextLine();
     String[] parts = bookingInput.split(",");

     String stageEvent = parts[0];
     String customer = parts[1];
     int noOfSeats = Integer.parseInt(parts[2]);

     TicketBooking booking = new TicketBooking(stageEvent, customer, noOfSeats);

     int choice = sc.nextInt();
     sc.nextLine(); // consume newline

     switch (choice) {
         case 1: // Cash payment
             double amount1 = sc.nextDouble();
             booking.makePayment(amount1);
             break;

         case 2: // Wallet payment
             double amount2 = sc.nextDouble();
             sc.nextLine(); // consume newline
             String walletNumber = sc.nextLine();
             booking.makePayment(amount2, walletNumber);
             break;

         case 3: // Credit card payment
             String holderName = sc.nextLine();
             double amount3 = sc.nextDouble();
             sc.nextLine(); // consume newline
             String cardType = sc.nextLine();
             String ccv = sc.nextLine();
             booking.makePayment(holderName, amount3, cardType, ccv);
             break;

         default:
             System.out.println("Invalid choice");
     }
 }
}

