public class Employee {
    private String firstName;
    private String middleName;
    private String lastName;
    private int department;
    private double salary;
    private static int employeeId = 0;
    private int id = 0;


    public Employee(String firstName, String middleName, String lastName, int department, double salary) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
        id = employeeId++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.middleName + " " + this.lastName + ", отдел " + this.department + ", зарплата " + this.salary + ", id " + this.id;
    }











}
