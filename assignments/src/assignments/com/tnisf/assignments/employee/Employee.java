package assignments.com.tnisf.assignments.employee;

/**
 * Base Employee class
 */
public class Employee {
    private String name;
    private int employeeId;
    private int salary;

    public Employee() {}

    public Employee(String name, int employeeId, int salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Getters & Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getEmployeeId() { return employeeId; }
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }

    public int getSalary() { return salary; }
    public void setSalary(int salary) { this.salary = salary; }

    public void display() {
        System.out.println("Name: " + name + ", EmployeeId: " + employeeId + ", Salary: " + salary);
    }
}
