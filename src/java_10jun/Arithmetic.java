package java_10jun;

public class Arithmetic {
    private int anInt ;
    private String name ;

    public Arithmetic(int anInt) {
        this.anInt = anInt;
        this.name = "";
    }

    public Arithmetic(String name) {
        this.name = name;
        this.anInt = 0;
    }


    public int add(int num1, int num2){
        return num1+num2;
    }
}


