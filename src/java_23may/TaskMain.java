package java_23may;

import java.util.*;
import java.util.function.Consumer;

public class TaskMain {
    public static void main(String[] args) {
//        Integer[] arr = {9, 20, 13, -4};
//        System.out.println(Arrays.toString(arr));
//        for (int i : arr) {
//            System.out.printf("traversing through array item at index %s is %s", i, i);
//            System.out.println();
//        }
//        Comparator<Integer> comparator = (o1, o2) -> {
//            return (o1-o2);
//        };
//
//        Arrays.sort(arr,comparator);
//        System.out.println(Arrays.toString(arr));
//        //Collections.sort(arr);
//       Spliterator<Integer> spliterators = Arrays.spliterator(arr);
//        System.out.println(Arrays.asList(arr));

        Set<Integer> mHashSet = new HashSet<>();
        //setImpl(mHashSet);
//        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println("iterrating over set ");
//                System.out.println(integer);
//            }
//        };
//        mHashSet.forEach(integerConsumer);
//        mHashSet.add(null);
//        System.out.println("hashSet :" + mHashSet);
//        Set<Integer> sortedSet = new TreeSet<>(mHashSet);
//        sortedSet.add(null);
//        System.out.println("sortedSet :" + sortedSet);
        //Collections.sort(new ArrayList<>(mHashSet));
        //Input : a[] = {1, 2, 3, 2, 1}, b[] = {3, 2, 2, 3, 3, 2}
        //Output : {3, 2, 1}

        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        Set<Integer> m = new HashSet<>();
        for (int j : a) {
            m.add(j);
        }

        for (int k : b) {
            m.add(k);
        }

        // System.out.println(m);

        //nput: a[] = { 5, 6, 2, 1, 4 }, b[] = { 7, 9, 4, 2 }
        //Output: { 2, 4 }
        //Explanation: The only common elements in both arrays are 2 and 4.
        // findIntersection();
        navigableSetImpl();

    }

    private static void navigableSetImpl() {
        NavigableSet<Integer> navigableSet = new TreeSet<>();
        // setImpl(navigableSet);

        navigableSet.add(12);
        navigableSet.add(56);
        navigableSet.add(78);
        navigableSet.add(120);
        navigableSet.add(345);
        navigableSet.add(5);
        navigableSet.add(34);
        System.out.println(navigableSet);

        // System.out.println( navigableSet.lower(76));
        // System.out.println(navigableSet.floor(86));
        //  Returns the least element in this set greater than or equal to the given element, or null if there is no such element.
//        System.out.println(navigableSet.ceiling(78));
//        System.out.println(navigableSet.pollFirst());
//        System.out.println(navigableSet.pollLast());
//        System.out.println(navigableSet);
//        System.out.println(navigableSet.headSet(56,true));
//        System.out.println(navigableSet.headSet(56));
        // System.out.println(navigableSet.tailSet(75,true));

        System.out.println(navigableSet.subSet(12, true, 56, false));

        // for tail set from pass element return inclusive or exclusive that element sorted set

    }

    private static void findIntersection() {
        //nput: a[] = { 5, 6, 2, 1, 4 }, b[] = { 7, 9, 4, 2 }
        //Output: { 2, 4 }
        //Explanation: The only common elements in both arrays are 2 and 4.
        Set<Integer> mSet = new HashSet<>();
        int[] a = {5, 6, 2, 1, 4};
        int[] b = {7, 9,};
        for (int a1 : a) {
            mSet.add(a1);
        }

        Set<Integer> m1 = new HashSet<>();

        for (int b1 : b) {
            if (mSet.contains(b1)) {
                m1.add(b1);
            }
            mSet.add(b1);
        }

        System.out.println(mSet);
        System.out.println(m1);
    }

    private static void setImpl(Set<Integer> mSet) {
        // set interface each item is unique and order does not maintain
        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random() * 100);
//            System.out.printf("number to be added is :%d",random);
//            System.out.println("");
            mSet.add(random);
        }
    }

}
