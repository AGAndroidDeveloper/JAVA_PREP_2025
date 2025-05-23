package java_16may;

public class Employee {
    private double salary;

    public double salary() {
        return salary;
    }

    public Employee(double salary) {
        this.salary = salary;
    }
}


class Manager extends Employee {
    private int bonus;

    public Manager(double salary) {
        super(salary);
    }

    @Override
    public double salary() {
        return super.salary() + bonus;
    }

    public void bonus(int bonus) {
        this.bonus = bonus;
    }


}
