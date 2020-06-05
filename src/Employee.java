
// create employee class
public class Employee {
    // three private instance variables—a first name (type String),
    // a last name (type String) and a monthly salary (double).
    private String firstName;
    private String lastName;
    // double is a primative and doesn't need to be capitalized vs String
    private double salary;

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;

    }

    // Setter and getter methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //create yearlySalary function to calculate/return annual income
    public double yearlySalary() {
        return salary * 12;
    }

    // create giveRaise function which will increase monthly salary by 10%
    public void giveRaise() {
    // store salary
        salary *= 1.1;

    }
}
