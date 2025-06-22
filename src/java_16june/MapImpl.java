package java_16june;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class MapImpl {
    private static Map<String, Purchase> purchases = new LinkedHashMap<>();
    private static NavigableMap<String, Student> students = new TreeMap<>();

    //1
    //2 3
    //4 5 6
    //7 8 9 10
    public static void main(String[] args) {
//        Course c1 = new Course("C001", "Math is Fun", "Advanced Math");
//        Course c2 = new Course("C002", "Java Master class", "Programming Language");
//        Course c3 = new Course("C003", "Kmp Project", "Kotlin Multiplatform");
//        Course c4 = new Course("J401", "MVVM", "Architecture Pattern");
//
//        addPurchases("Larry Page", c1, 124.55);
//        addPurchases("Ortan", c2, 234.98);
//        addPurchases("Ankit Gupta", c1, 879.23);
//        addPurchases("Elone Musk", c4, 6646.23);
//        addPurchases("Tim Cook", c3, 98.23);
//
//        students.forEach((key,s)->{
//            System.out.println(key+" : "+s);
//        });
//        System.out.println("------------------------------");
//        purchases.forEach((key,pr) ->{
//            System.out.println(key+" : "+pr);
//        });

      //  rightAngleTriangle();
        //invertedRightAngleTriangle(6);
       // centerdPyramidTriangle();
        invertedPyramid();
    }

    private static void invertedPyramid() {
        //*******
        // *****
        //  ***
        //   *
        int row = 4;
        int colum = 7;
        int mid = colum/2;
//        for (int i = 0; i <row ; i++) {
//            for (int j = 0; j < ; j++) {
//
//            }
//        }
    }

    private static void centerdPyramidTriangle() {
        //   *
        //  ***
        // *****
        //*******

        // 4*7 matrix
        int row = 4;
        int colum = 7;

        int mid = colum/2;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                if (j>=mid-i && j<=mid+i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

        
    }

    private static void invertedRightAngleTriangle(int size) {
        for (int i = 0; i <size ; i++) {
            for (int j = 0; j <size ; j++) {
                if (j<=size-1-i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }

    private static void rightAngleTriangle() {
        int size = 4;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <size; j++) {
                if (j>=size-1-i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    private static void addPurchases(String name, Course course, double price) {
        Student existingStudent = students.get(name);
        if (existingStudent == null) {
            existingStudent = new Student(name, course);
            students.put(name, existingStudent);
        } else {
            existingStudent.addCourse(course);
        }

        int day = students.size() + 1;
        String key = course.courseId() + "_" + existingStudent.id();
        int year = LocalDate.now().getYear();
        Purchase pr = new Purchase(course.courseId(), existingStudent.id(), day, price, year);
        purchases.put(key, pr);
    }
}
