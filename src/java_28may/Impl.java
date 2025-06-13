package java_28may;

import collection_framework.WeeK;

import java.util.*;

public class Impl {
    enum WeekDays {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        // findVowelsAndConsonants();
        Integer[] arr = {12, 34, 67, 83, 2, 40, 40, 345, 345};
        // findSecondHighestNumber(arr);
        System.out.print(calculatePrimeNumber(5) + " ");

//        WeekDays m = WeekDays.FRIDAY;
//        for (WeekDays i : WeekDays.values()) {
//            System.out.println(" " + i);
//
//        }
        //findDays(m);


    }

    private static boolean calculatePrimeNumber(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }


    private static void findSecondHighestNumber(Integer[] arr) {
        Arrays.sort(arr);
        System.out.println("sorted Array" + Arrays.toString(arr));
        int size = arr.length;
        if (Objects.equals(arr[size - 1], arr[size - 2])) {
            System.out.println("the 2nd largest number is " + arr[size - 3]);
        } else {
            System.out.println("the 2nd largest number is " + arr[size - 2]);
        }
    }

    private static void findVowelsAndConsonants() {
        String h = "Ankit@123".toLowerCase();
        int vowels = 0;
        int consonants = 0;
        Character[] characters = {'a', 'e', 'i', 'o', 'u'};
        List<Character> mChar = List.of(characters);
        System.out.println("char Array " + mChar);

        for (int i = 0; i < h.length(); i++) {
            char a = h.charAt(i);
            if (Character.isLetter(a)) {
                if (mChar.contains(a)) {
                    System.out.println("consonants for char " + a);
                    vowels++;
                } else {
                    consonants++;
                    System.out.println("consonants found for char " + a);

                }
            }

        }
        System.out.println("vowels count is " + vowels + " consonants count is  " + consonants);
    }

    private static void findDays(WeekDays m) {
        String value =
                switch (m) {
                    case FRIDAY -> "the day is Friday";
                    case MONDAY -> "the day is MONDAY";
                    case SUNDAY -> "the day is SUNDAY";
                    case TUESDAY -> "the day is TUESDAY";
                    case SATURDAY -> "the day is SATURDAY";
                    case THURSDAY -> "the day is THURSDAY";
                    case WEDNESDAY -> "the day is WEDNESDAY";
                };
        System.out.println(value);
    }
}
