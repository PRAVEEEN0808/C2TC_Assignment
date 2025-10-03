package assignments.com.tnisf.assignments.utilties;

import assignments.com.tnisf.assignments.employee.Employee;

public class EmployeeUtilities {

    // Print employee details
    public static void printEmployeeDetails(Employee emp) {
        emp.display();
    }

    // Increase salary
    public static void increaseSalary(Employee emp, int percentage) {
        int newSalary = emp.getSalary() + (emp.getSalary() * percentage / 100);
        emp.setSalary(newSalary);
        System.out.println(emp.getName() + "'s New Salary after " + percentage + "% hike: " + newSalary);
    }
}
