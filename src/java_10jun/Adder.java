package java_10jun;

public class Adder extends Arithmetic {
    private int name;

    public Adder(int anInt) {
        super(anInt);
    }

    // construtor overload
    public Adder(String name) {
        super(name);
    }


}
