package homeworks.HW16;


public class CreatingObjects {
    public static void main(String[] args) {

        Employee employee = new Employee("Bob", 45, "+2323232", "Street", 1000, "Worker");

        Manager manager = new Manager("Nick", 45, "+343434343", "Street", 2000, "Sales");

        employee.printSalary();
        manager.printSalary();

    }

}
