package assignments.com.tnisf.assignments;

import assignments.com.tnisf.assignments.employee.Manager;
import assignments.com.tnisf.assignments.employee.Developer;
import assignments.com.tnisf.assignments.utilties.EmployeeUtilities;

public class main {
    public static void main(String[] args) {
        // Create Manager instance
        Manager manager = new Manager("Alice", 101, 90000, "IT");

        // Create Developer instance
        Developer developer = new Developer("Bob", 102, 70000, "Java");

        // Use utilities
        EmployeeUtilities.printEmployeeDetails(manager);
        EmployeeUtilities.increaseSalary(manager, 10);

        System.out.println("----");

        EmployeeUtilities.printEmployeeDetails(developer);
        EmployeeUtilities.increaseSalary(developer, 15);
    }
}
