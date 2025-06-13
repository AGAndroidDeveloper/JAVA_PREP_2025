import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class java_9june {
    public static void main(String[] args) {
        //  mapImpl();
//        wordsOccurences();
//        copyHasmap();
        //  duplicateCharPrint();

        Map<Integer, Integer> integerStringMap = new HashMap<>();
        map10JunImpl(integerStringMap);
    }


    private static void map10JunImpl(Map<Integer, Integer> integerStringMap) {
        integerStringMap.put(11,23);
        integerStringMap.put(34,2);
        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random() * 100);
            integerStringMap.put(i, random);
        }
        integerStringMap.put(24,2);
        System.out.println(integerStringMap);
      //  integerStringMap.putIfAbsent();

    }

    private static void duplicateCharPrint() {
        String str = "geeksforgeeks";
        char[] charArr = str.toCharArray();
        System.out.println(Arrays.toString(charArr));
        Map<Character, Integer> mCharMap = new HashMap<>();
        for (char key : charArr) {
            if (!mCharMap.containsKey(key)) {
                mCharMap.put(key, 1);
            } else {
                mCharMap.merge(key, mCharMap.get(key), (k, v) -> v + 1);
            }
        }

        System.out.println("map " + mCharMap);
    }

    private static void copyHasmap() {
        Map<Character, Integer> map1 = new HashMap<>();
        map1.put('A', 1);
        map1.put('B', 2);
        map1.put('C', 3);
        System.out.println(map1);
        Map<Character, Integer> map2 = new HashMap<>(map1);
        map2.put('D', 4);
        System.out.println(map2);
    }


    private static void wordsOccurences() {
        //Input: "Alice is girl and Bob is boy"
        //Output: { Bob=1 , Alice=1 , and=1 , is=2 , girl=1 , boy=1 }


        String input = "Alice is girl and Bob is boy is boy girl girl";
        // System.out.println(input.length());
        System.out.println(input.stripIndent());

        //  System.out.println(String.join(input, "a"));
        String[] mArr = input.split(" ");
        System.out.println(Arrays.toString(mArr));
        Map<String, Integer> wordMap = new HashMap<>();
        //approach1(mArr, mm);
        // approach2WithCompute(mArr, wordMap);
        approach3WithMerge(mArr, wordMap);
        System.out.println(wordMap);

    }

    private static void approach3WithMerge(String[] mArr, Map<String, Integer> wordMap) {
        for (String key : mArr) {
            if (!wordMap.containsKey(key)) {
                wordMap.put(key, 1);
            } else {
                wordMap.merge(key, wordMap.get(key), (k, v) -> v + 1);
            }
        }
    }

    private static void approach2WithCompute(String[] mArr, Map<String, Integer> wordMap) {
        for (String key : mArr) {
            if (!wordMap.containsKey(key)) {
                wordMap.put(key, 1);
            } else {
                wordMap.compute(key, (key1, value) -> {
                    if (value != null) {
                        return value + 1;
                    }
                    return null;
                });
            }
        }
    }

    private static void approach1(String[] mArr, Map<String, Integer> mm) {
         /*
            Approach 1 using brute force conditional logic:
         */
        for (String key : mArr) {
            if (!mm.containsKey(key)) {
                mm.put(key, 1);
            } else {
                int value = mm.get(key);
                value++;
                mm.put(key, value);
            }
        }
    }

    private static void mapImpl() {
        Map<Integer, String> myMap = new HashMap<>();
        int[] arr = {12, 34, 52, 67, 98, 1, 27};
        Arrays.sort(arr);
        System.out.println("sorted Array: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            myMap.put(i, String.valueOf(arr[i]));
        }

        myMap.put(0, String.valueOf(-1));
//        myMap.put(null,"heloo");
//        myMap.put(null,"___");
        BiConsumer<Integer, String> consumer = (integer, s) -> {
//            System.out.printf("iterate from map key is %s, value is %s", integer, s);
//            System.out.println();
        };
//        myMap.forEach(consumer);
//        System.out.println(myMap.values());
//        System.out.println(myMap.keySet());
//        myMap.putIfAbsent(23,"ankit");
//        myMap.forEach(consumer);
//        System.out.println(myMap.values());
//        System.out.println(myMap.keySet());
        // myMap.computeIfAbsent()
        System.out.println(myMap.entrySet());
        System.out.println(myMap.getOrDefault(18, "default value"));

    }


}
