package java_31may;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetImpl {
    public static void main(String[] args) {

        // NavigableSet<String> mNavigableSet = new TreeSet<>();
        String input = "Ankit";
//        System.out.println(input.hashCode());
//        input = "hello";
//        System.out.println(input.hashCode());
//        System.out.println(input);
//        StringBuilder reverse = new StringBuilder(input).reverse();
//        System.out.println(reverse);

        System.out.println(input.hashCode());
        String a1 = input + " an";
        System.out.println(a1 + " " + a1.hashCode());

        StringBuilder a = new StringBuilder(input);

        a.append('A');
        a.append(" ");
        a.append(123);
        a.append(" __");
        System.out.println(a);
        System.out.println(a.hashCode());
    }
}
