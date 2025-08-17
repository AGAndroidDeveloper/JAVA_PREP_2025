package java_stream_26july;

import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCodingQ_4aug {
    public static void main(String[] args) {

        //  easyQuestionWithStream();
        mediumQuestionWithStream();
        hardQuestionWithStream();
    }

    private static void easyQuestionWithStream() {
        /*
        Given a list of integers, how would you use Stream to print only even numbers?

        How can you convert a list of strings to uppercase using Java 8 streams?

        How do you count the number of elements in a stream?

        How do you sort a list of strings in reverse alphabetical order using streams?

        How can you find the maximum number from a list of integers using Stream API?
        */


        //1.  Given a list of integers, how would you use Stream to print only even numbers?
        System.out.println("-------------------------------------------------------------");
        int[] arr = {2, 14, 56, 7, 9};
        Arrays.stream(arr).filter(x -> x % 2 == 0)
                .forEach(x -> System.out.print(x + " "));
        System.out.println();

        System.out.println("-------------------------------------------------------------");
        //2.  How can you convert a list of strings to uppercase using Java 8 streams?
        Stream.of("apl", "bata", "reabok").map(String::toUpperCase)
                .forEach(x -> System.out.print(x + " "));
        System.out.println();

        System.out.println("-------------------------------------------------------------");
        System.out.println(Stream.of(1, 2, 3, 4).count());
        ;

        System.out.println("-------------------------------------------------------------");


    }

    private static void mediumQuestionWithStream() {
        /*
        How do you group a list of strings by their length using the Stream API?
        How would you remove duplicate elements from a list using streams?
        Given a list of Employee objects, how would you collect names of employees into a single comma-separated string?
        How can you filter all transactions from a list where amount > 1000 and then sort them by amount?
        Given a list of strings, how do you create a Map where the key is the string and the value is its length?
         */

        //1.How do you group a list of strings by their length using the Stream API?

        // 5,list("Apple","Mango")

        groupStringByLength(getStringsData());

    }

    private static void groupStringByLength(List<String> fruits) {

        // {5=[Apple, Mango], 6=[Banana, Orange, Grapes, Papaya], 9=[Pineapple], 10=[Watermelon, Strawberry], 11=[Pomegranate]}
        // first I'll try with traditional approach
        usingMap(fruits);

        // now using java stream
        Collectors.groupingBy()

    }


    private static void usingMap(List<String> fruits) {
        Map<Integer, List<String>> groupFruit = new HashMap<>(fruits.size());

        for (String fruit : fruits) {
            int length = fruit.length();
            if (!groupFruit.containsKey(length)) {
                groupFruit.put(length, new ArrayList<>(Collections.singleton(fruit)));
            } else {
                List<String> m = groupFruit.get(length);
//                m.add(fruit);
                // That line isn't needed because you're already modifying the list m, which is a reference to the original list stored in the map.
                // groupFruit.replace(length,m);
                groupFruit.merge(length, m, (key, value) -> {
                    value.add(fruit);
                    return value;
                });

                groupFruit.compute()
            }
        }

        System.out.println(groupFruit);
    }


    private static void hardQuestionWithStream() {

    }

    @NotNull
    private static List<String> getStringsData() {
        return Arrays.asList(
                "Apple",
                "Banana",
                "Mango",
                "Orange",
                "Pineapple",
                "Grapes",
                "Watermelon",
                "Papaya",
                "Strawberry",
                "Pomegranate"
        );
    }

}
