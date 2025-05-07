import java.io.InputStream;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private int hel = 34;

    public static void main(String[] args) {
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());


    }

    public static void getEvenDigitSum(int number) {

    }


    public static int sumFirstAndLastDigit(int number) {
        int sum = 0;
        char[] target = String.valueOf(number).toCharArray();
        if (number < 0) {
            sum = -1;
        } else {
            if (target.length == 1) {
                sum = 2 * number;
            } else {
                for (int i = 0; i < target.length; i++) {
                    if (i == 0 || i == target.length - 1) {
                        sum = sum + Integer.parseInt(String.valueOf(target[i]));
                    }
                }
            }
        }


        return sum;
    }

    public static boolean isPalindrome(int number) {
        //65
        char[] arr = String.valueOf(number).replaceFirst("-", "").toCharArray();
        String a = String.valueOf(number).replace("-", "");

        StringBuilder reverseString11 = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            reverseString11.append(arr[i]);
        }

        return a.contentEquals(reverseString11);
    }


    private static void sum3And5Challenge() {
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 15 == 0) {
                sum = sum + i;
            }
        }

        System.out.println("sum of allNumber =>" + sum);
    }

    private static void whileLoopExpression(List<Integer> mLIST) {
        int index = 0;
        while (index <= mLIST.size() - 1) {
            System.out.print(mLIST.get(index) + ":");
            index++;
        }
    }

    public static boolean primNumberExample(int wholeNumber) {
        // check if wholenumber is prime or not
        if (wholeNumber < 2) {
            return false;
        }

        for (int divisble = 2; divisble < wholeNumber; divisble++) {
            if (wholeNumber % divisble == 0) {
                return false;
            }
        }

        return true;
    }

    public static void printDayOfWeek(int day) {
        String dayOfThatDay = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Not Valid day";
        };
        System.out.println(dayOfThatDay);
    }

    public static boolean isLeapYear(int year) {
        boolean isLeapYear = false;
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    isLeapYear = year % 400 == 0;
                } else {
                    isLeapYear = true;
                }
            }
        }
        return isLeapYear;

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking) {
            if (hourOfDay < 0 || hourOfDay > 23) {
                return false;
            } else {
                return hourOfDay < 8 || hourOfDay > 22;
            }
        } else {
            return false;
        }
    }

    public int hel() {
        return hel;
    }

    public Main setHel(int hel) {
        this.hel = hel;
        return this;
    }

//    public static double calculatePercentage(int marks) {
//        double percentage;
//        switch (marks) {
//
//
//        }
//    }


}