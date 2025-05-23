package java_16may;

public class Company {
    public static void main(String[] args) {
        Employee employee = new Employee(60000);
        System.out.printf("salary of employee is %f", employee.salary());
        System.out.println();
        Manager manager = new Manager(200000);
        manager.bonus(5000);
        System.out.printf("salary of manager is %.1f", manager.salary());
    }

}
