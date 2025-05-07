package java_practice_1may;

public class Employee extends Worker {
    private long employeeId;
    private String hireDate;

    public Employee(String birthDate, String endDate, String name, long employeeId, String hireDate) {
        super(birthDate, endDate, name);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                '}';
    }

    @Override
    public double collectPay() {
        return super.collectPay();
    }


}
