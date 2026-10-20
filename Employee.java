public class Employee {
    String name;
    int id;
    float Salary;
    String desg;
}

class Office extends Employee {
    public static void main(String[] args) {
        
        Employee e = new Employee();
        Employee e1 = new Employee();

        System.out.println(e.name);
        System.out.println(e.id);
        System.out.println(e.Salary);
        System.out.println(e.desg);

        System.out.println(e1.name);
        System.out.println(e1.id);
        System.out.println(e1.Salary);
        System.out.println(e1.desg);
    }
}