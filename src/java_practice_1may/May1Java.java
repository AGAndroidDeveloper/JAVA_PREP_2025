package java_practice_1may;

public class May1Java {
    public static void main(String[] args) {
        /*  Worker myWorker = new Worker("11/11/1999", "10/06/2025", "Tony");
//        Employee currentEmployee = new Employee("11/11/1999", "10/06/2025", "Worker", 12L, "05/06/23");
//        currentEmployee.collectPay();
//        int number = 10;*/
        //    Worker myWorkerObj = new Worker();
        /* System.out.println(myWorkerObj); */

        String a = "Ankit" + " Gupta";
        System.out.println(a + " length :" + a.length());
        String newA = a.concat(" hello");
        System.out.println(newA);


       // System.out.println("a".repeat(12));

        StringBuilder myStringBuilder = new StringBuilder();
        myStringBuilder.append(12);
        myStringBuilder.append("hello ")
                .append('A' + "\n")
                .append(12.98);
        System.out.println(myStringBuilder);
        myStringBuilder.reverse();
        System.out.println(myStringBuilder);


    }

    public static void stringFormatter(String name) {
        for (int i = 0; i < name.length(); i++) {
            System.out.printf("char at index " + i + " is %c %n", name.charAt(i));
        }
    }
}
