package java_stream_26july;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {
        List<Integer> mList = Stream.iterate(1, x -> x + 1).limit(20000).toList();

        //  System.out.println(factorial(6));
        ;

        // using sequencial stream
//        long startTime = System.currentTimeMillis();
//        List<Integer> finalFactorialList = mList.stream().map(ParallelStream::factorial).toList();
//        long endTime = System.currentTimeMillis();
//        System.out.println("time taken using normal stream " + (endTime - startTime) + " ms");
//        System.out.println("finalFactorialList "+finalFactorialList);
//
//
//        // using parallelStream stream
//        startTime = System.currentTimeMillis();
//        finalFactorialList = mList.parallelStream().map(ParallelStream::factorial).toList();
//        endTime = System.currentTimeMillis();
//        System.out.println("time taken using ParallelStream stream " + (endTime - startTime) + " ms");
//        System.out.println("finalFactorialList "+finalFactorialList);

        Function<Integer, Integer> mFunction1 = integer -> integer * integer;
        Function<Integer, Integer> mFunction2 = integer -> integer + integer;
        System.out.println(mFunction1.apply(5));
        ;
        System.out.println(mFunction2.apply(5));

        System.out.println(mFunction1.andThen(mFunction2).apply(4));
        System.out.println(mFunction1.compose(mFunction2).apply(6));


    }


    public static int factorial(int x) {
        if (x <= 0 || x == 1) {
            return 1;
        }

        return x * factorial(x - 1);

    }
}
