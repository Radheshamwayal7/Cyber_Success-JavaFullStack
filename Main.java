
class EmployeeIn {
    public String name;
    public int salary;

    public void Show() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends EmployeeIn {
    public String dept;

    public void ShowManager() {
        Show();
        System.out.println("Department: " + dept);
    }
}

public class Main {
    public static void main(String[] args) {

        EmployeeIn emp = new EmployeeIn();
        emp.name = "King";
        emp.salary = 100000;

        Manager m = new Manager();
        m.name = "Sham";
        m.salary = 150000;
        m.dept = "IT";

        System.out.println("Employee Details:");
        emp.Show();

        System.out.println("\nManager Details:");
        m.ShowManager();
    }
}
