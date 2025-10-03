package assignment.com.tnisf.ass2;
	import java.util.Scanner;

	// Student class
	class Student {
	    Student() {
	        System.out.println("Student object is created");
	    }
	}

	
	class Commission {
	    private String name;
	    private String address;
	    private String phone;
	    private double salesAmount;

	    // Method to accept details
	    public void acceptDetails() {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Employee Name: ");
	        name = sc.nextLine();

	        System.out.print("Enter Address: ");
	        address = sc.nextLine();

	        System.out.print("Enter Phone: ");
	        phone = sc.nextLine();

	        System.out.print("Enter Sales Amount: ");
	        salesAmount = sc.nextDouble();
	    }

	    // Method to calculate commission
	    public void calculateCommission() {
	        double commission;

	        if (salesAmount >= 100000) {
	            commission = salesAmount * 0.10;
	        } else if (salesAmount >= 50000) {
	            commission = salesAmount * 0.05;
	        } else if (salesAmount >= 30000) {
	            commission = salesAmount * 0.03;
	        } else {
	            commission = 0;
	        }

	        System.out.println("Name: " + name);
	        System.out.println("Address: " + address);
	        System.out.println("Phone: " + phone);
	        System.out.println("Sales Amount: " + salesAmount);
	        System.out.println("Commission: " + commission);
	    }
	}

	public class MainDemo {
	    public static void main(String[] args) {
	        
	        Student s1 = new Student();
	        Commission c1 = new Commission();
	        c1.acceptDetails();       
	        c1.calculateCommission(); 
	    }
	}

