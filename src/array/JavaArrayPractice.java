package array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class JavaArrayPractice {
    public static void main(String[] args) {

        //  arrayExample();
        Integer[] arr = getRandomArray(10);
        //  Integer[] arr = new Integer[]{12,33,42,45,58,18};
        int[] arr12 = new int[]{12, 33, 10, 69, 2, 15};
        System.out.println("minElement:: " + findMinElementChallenge(arr12));
      //  sortInDescendingOrder(arr);

//        System.out.println(Arrays.toString(arr));
//        int findItemIndex = sortArray(arr, 15);
//        System.out.println("item found at index " + findItemIndex);
        // System.out.println(Arrays.equals(arr, arr12));
        ;

        // fill method
//        int [] myArr = new int[]{12,33,54,69,20,15};
//        System.out.println(Arrays.toString(myArr));
//        Arrays.fill(myArr,41);
//        System.out.print("filll methodUse case :");
//        System.out.println(Arrays.toString(myArr));

//      int [] newCopyArr =   Arrays.copyOf(myArr,myArr.length);
//        System.out.println(Arrays.toString(newCopyArr));
     //   varargsExample(12, 23, 34);
    }

    private static int findMinElementChallenge(int[] array) {
        if (array.length > 0) {
            int minElement = 100000000;
            for (int j : array) {
                if (j < minElement) {
                    minElement = j;
                }
            }
            return minElement;
        }
        return -1;
    }
    
    private static void varargsExample(int... args) {
    }

    private static void sortInDescendingOrder(Integer[] arr) {
        System.out.println("withoutSort arr " + Arrays.toString(arr));
        Comparator<Integer> myComparetor = (o1, o2) -> {
            if (o1 < o2) {
                return 1;
            } else {
                return -1;
            }
        };
        Arrays.sort(arr, myComparetor);
        System.out.println("sorted arr " + Arrays.toString(arr));

    }

    private static int sortArray(int[] arr, int key) {
        Arrays.sort(arr);
        System.out.println("sorted :" + Arrays.toString(arr));
        return Arrays.binarySearch(arr, key);

    }

    public static Integer[] getRandomArray(int length) {
        Integer[] myArr = new Integer[length];
        Random myRandom = new Random();
        for (int i = 0; i < length; i++) {
            myArr[i] = myRandom.nextInt(1000);
        }
        return myArr;
    }

    public static void arrayExample() {
        int[] intArray;
        intArray = new int[]{12, 34, 28, 60, 72, 123, 654, 71};
        // System.out.println(Arrays.toString(intArray));
//        for (int i = 0; i < intArray.length; i++) {
//            System.out.println("item at index " + intArray[i]);
//        }

        System.out.println(Arrays.binarySearch(intArray, 72));
        //System.out.println(Arrays.);
//        for (int myArr : intArray) {
//            System.out.println("item get via enhanced loop" + myArr);
//        }

    }


}
