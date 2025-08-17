package java_stream_26july;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String name() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public int age() {
        return age;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }
}
