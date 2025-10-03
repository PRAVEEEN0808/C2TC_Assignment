package assignments.com.tnisf.assignments.employee;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int employeeId, int salary, String programmingLanguage) {
        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
