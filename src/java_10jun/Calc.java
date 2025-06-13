package java_10jun;

import java.util.*;

public class Calc {
    public static void main(String[] args) {
        fibonacciSeries(10);
        //angram();
//        String input = "Ankit Gupta  A".replaceAll(" ", "").toLowerCase();
//        System.out.println(input);
//        System.out.println(input.trim());
//        ;
//        Character firstNonRepeatNumber = firstNonRepeatedNumber(input);
//        System.out.println(firstNonRepeatNumber);

//        Set<Integer> a = new HashSet<>();

//        String input = "Ankit";
//        String reverseString = "";
//
//        for (int i = input.length() - 1; i >= 0; i--) {
//            reverseString = reverseString.concat(String.valueOf(input.charAt(i)));
//        }
//
//        System.out.println(reverseString);

        //System.out.println(factorial(5));
    }

    private static void fibonacciSeries(int n) {
        int[] mArr = new int[n];

        if (n > 0) mArr[0] = 0;
        if (n > 1) mArr[1] = 1;

        for (int j = 2; j < n; j++) {
            mArr[j] = mArr[j - 1] + mArr[j - 2];
        }

        System.out.println(Arrays.toString(mArr));
    }


    private static void angram() {
        String input = "listen";
        String input2 = "silent";
        char[] charArr1 = input.toCharArray();
        char[] charArr2 = input2.toCharArray();
        Arrays.sort(charArr1);
        Arrays.sort(charArr2);
        System.out.println(Arrays.toString(charArr1));
        System.out.println(Arrays.toString(charArr2));
        boolean isAnagram = Arrays.equals(charArr1, charArr2);
        System.out.println(isAnagram);
    }


    public static Character firstNonRepeatedNumber(String input) {
        Map<Character, Integer> mLinkedHashMap = new LinkedHashMap<>();
        for (Character character : input.toCharArray()) {
            if (!mLinkedHashMap.containsKey(character)) {
                mLinkedHashMap.put(character, 1);
            } else {
                mLinkedHashMap.merge(character, mLinkedHashMap.get(character), (k, v) -> v + 1);
            }
        }

        System.out.println(mLinkedHashMap);
        Set<Character> mSet = mLinkedHashMap.keySet();

//        for (Character character : mSet) {
//            if (mLinkedHashMap.get(character) == 1) {
//                return character;
//            }
//        }
        List<Character> mCharList = new ArrayList<>(mSet);
// so that it can return last non repeating char
        for (int i = mCharList.size() - 1; i >= 0; i--) {
            if (mLinkedHashMap.get(mCharList.get(i)) == 1) {
                return mCharList.get(i);
            }
        }

        return null;
    }


    public static int factorial(int a) {
        if (a == 0 || a == 1) {
            return 1;
        }
        return (a * factorial(a - 1));


    }
}
