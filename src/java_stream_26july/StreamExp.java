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


        var bingoStream = bingoBook.stream()
                .limit(5)
                .filter(s -> s.charAt(0) == 'G' || s.charAt(0) == 'O')
                .map(s -> s.charAt(0) + "-" + s.substring(1))
                .sorted();
        System.out.println("------------------------------------------------------------------------------");
        bingoStream.forEach(x -> System.out.println(x + " "));
        System.out.println("------------------------------------------------------------------------------");

        bingoStream.forEach(x -> System.out.println(x.toLowerCase() + " "));


    }
}
