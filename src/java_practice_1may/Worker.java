package java_practice_1may;

public class Worker {
    private String birthDate;
    private String endDate;
    private String name;

    public Worker() {
        this("12/03/99", "11/03/25", "Tony");
    }

    public Worker(String birthDate, String endDate, String name) {
        this.birthDate = birthDate;
        this.endDate = endDate;
        this.name = name;
        System.out.println("Worker {" +
                "birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", name='" + name + '\'' +
                '}');
    }

    public int getAge() {
        return 10;
    }

    public double collectPay() {
        return 20;
    }

    public void terminate(String date) {

    }

    @Override
    public String toString() {
        return "Worker {" +
                "birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
