package java_stream_26july;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExp {
    public static void main(String[] args) {

        // bingo example
        ArrayList<String> bingoBook = new ArrayList<>(75);
        char[] charArr = "BINGO".toCharArray();

        int start = 1;
        for (char c : charArr) {
            for (int i = start; i < start + 15; i++) {
                bingoBook.add("" + c + i);
            }
            start += 15;
        }

        //  System.out.println(bingoBook);
        Collections.shuffle(bingoBook);
        for (String a : bingoBook) {
            // System.out.println(a);
        }

//        System.out.println("------------------------------------------------------------------------------");
//        List<String> firstOnes = bingoBook.subList(0, 15);
//        firstOnes.sort(Comparator.naturalOrder());
//        System.out.println("------------------------------------------------------------------------------");
//        for (String firstOne : firstOnes) {
//           // System.out.println(firstOne);
//        }
//        System.out.println("------------------------------------------------------------------------------");
//
//        firstOnes.replaceAll(s -> {
//            if (s.charAt(0) == 'G' || s.charAt(0) == 'O') {
//                return s.charAt(0) + "-" +s.substring(1);
//            }
//            return s;
//        });
//
//        for (String firstOne : firstOnes) {
//            System.out.println(firstOne);
//        }
//
//        System.out.println("------------------------------------------------------------------------------");
//        // by using stream
        Consumer<String> myConsumer = s -> System.out.print(s + " ");

        Character character = 'a';

        bingoBook.stream()
                .limit(15)
                .filter(s -> s.charAt(0) == 'G' || s.charAt(0) == 'O')
                .map(s -> s.charAt(0) + "-" + s.substring(1))
                .sorted()
                .forEach(myConsumer);


        // functional programming
        Function<Integer, Integer> before = x -> x * 3;
        Function<Integer, Integer> after = x -> x + 2;
        System.out.println();
        System.out.println("------------------------------------------------------------------------------");
// and them function 1st call apply function for before and it's result to after function
        //and in compose it change to reverse
        System.out.println(before.andThen(after).apply(5));
        ;
        System.out.println("------------------------------------------------------------------------------");

        System.out.println(before.compose(after).apply(10));

        // System.out.println(function.andThen(function2).apply(10));
        ;
        // System.out.println(function.apply(2));

        // SUPPLIER
        Supplier<Integer> mySupplier = () -> Math.toIntExact(System.currentTimeMillis() % 60000);
        System.out.println(mySupplier.get());

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------------");

        /* Method  Reference */
        List<String> strings = Arrays.asList("A", "B", "c", "c", "d");

        strings.forEach(System.out::println);
        /* To perform a computation, stream operations are composed into
         a stream pipeline. A stream pipeline consists of a source (which might be an array,
          a collection, a generator function, an I/O channel, etc), zero or more intermediate operations
          (which transform a stream into another stream, such as filter(Predicate)), and a terminal
          operation (which produces a result or side-effect, such as count() or forEach(Consumer)).
           Streams are lazy; computation on the source data is only performed when the terminal operation is initiated,
           and source elements are consumed only as needed. */


        // how to use stream
        // for this source , intermediate operation and terminal operation\
        strings.stream()
                .map(x -> x + "-" + 12)
                .forEach(System.out::println);

        List<Integer> mList = List.of(1, 2, 3, 4, 5, 6, 7);

//        System.out.println(
//                mList.stream()
//                .filter(x -> x % 2 != 0)
//                .count()
//        );
//
//        List<String> names = Arrays.asList("Ankit","Ram","Lucky","Monalisa","Jack Sparrow");
//        names.stream().filter(x ->x.toLowerCase().startsWith("a")||x.toLowerCase().endsWith("a"))
//                .forEach(System.out::println);
//        System.out.println("------------------------------------------------------------------------------");
//        System.out.println("------------------------------------------------------------------------------");
//
//        Optional<Integer> reduce = mList.stream().reduce((x, y) -> x - y);
//        System.out.println(reduce.get());

        List<Integer> list = mList.stream()
                .sorted().takeWhile(x -> x%2!=0)
                .toList();
        System.out.println(list);


    }
}
