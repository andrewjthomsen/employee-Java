public class EmployeeTest {
    public static void main(String[] args) {
        // create two employee objects and display employee's yearly salary
        // Sally is a part-time bank teller
        Employee sallyHanson = new Employee("Sally", "Hanson", 1200);
        // Robert is the boss
        Employee robertFinklstein = new Employee("Robert", "Finklestein", 5000);
        System.out.println(sallyHanson.yearlySalary() + " " + robertFinklstein.yearlySalary());

    }
}

