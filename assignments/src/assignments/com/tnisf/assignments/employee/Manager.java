package assignments.com.tnisf.assignments.employee;

public class Manager extends Employee {
    private String department;

    public Manager(String name, int employeeId, int salary, String department) {
        super(name, employeeId, salary);
        this.department = department;
    }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    @Override
    public void display() {
        super.display();
        System.out.println("Department: " + department);
    }
}
