package assignments4;

import java.util.*;

//Step 1: Interface definition
interface Airfare {
 double calculateAmount();
 void display();
}

//Step 2: AirIndia class
class AirIndia implements Airfare {
 private int hours;
 private double costPerHour;

 // Default constructor
 public AirIndia() {}

 // Parameterized constructor
 public AirIndia(int hours, double costPerHour) {
     this.hours = hours;
     this.costPerHour = costPerHour;
 }

 // Getters and Setters
 public int getHours() { return hours; }
 public void setHours(int hours) { this.hours = hours; }

 public double getCostPerHour() { return costPerHour; }
 public void setCostPerHour(double costPerHour) { this.costPerHour = costPerHour; }

 // Implement methods
 public double calculateAmount() {
     return hours * costPerHour;
 }

 public void display() {
     System.out.printf("%.2f\n", calculateAmount());
 }
}

//Step 3: KingFisher class
class KingFisher implements Airfare {
 private int hours;
 private double costPerHour;

 public KingFisher() {}

 public KingFisher(int hours, double costPerHour) {
     this.hours = hours;
     this.costPerHour = costPerHour;
 }

 public int getHours() { return hours; }
 public void setHours(int hours) { this.hours = hours; }

 public double getCostPerHour() { return costPerHour; }
 public void setCostPerHour(double costPerHour) { this.costPerHour = costPerHour; }

 public double calculateAmount() {
     return hours * costPerHour * 4;
 }

 public void display() {
     System.out.printf("%.2f\n", calculateAmount());
 }
}

//Step 4: Indigo class
class Indigo implements Airfare {
 private int hours;
 private double costPerHour;

 public Indigo() {}

 public Indigo(int hours, double costPerHour) {
     this.hours = hours;
     this.costPerHour = costPerHour;
 }

 public int getHours() { return hours; }
 public void setHours(int hours) { this.hours = hours; }

 public double getCostPerHour() { return costPerHour; }
 public void setCostPerHour(double costPerHour) { this.costPerHour = costPerHour; }

 public double calculateAmount() {
     return hours * costPerHour * 8;
 }

 public void display() {
     System.out.printf("%.2f\n", calculateAmount());
 }
}

//Step 5: Main class (Driver)
public class Main {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     int choice = sc.nextInt();   // 1, 2, or 3
     int hours = sc.nextInt();
     double costPerHour = sc.nextDouble();

     Airfare flight = null;

     // Choosing the airline
     switch (choice) {
         case 1:
             flight = new AirIndia(hours, costPerHour);
             break;
         case 2:
             flight = new KingFisher(hours, costPerHour);
             break;
         case 3:
             flight = new Indigo(hours, costPerHour);
             break;
         default:
             System.out.println("Invalid choice");
             System.exit(0);
     }

     // Display result
     flight.display();
 }
}
