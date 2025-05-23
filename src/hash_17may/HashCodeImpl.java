package hash_17may;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class HashCodeImpl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter name");
        String name = scanner.nextLine();
        System.out.println("enter your emailId");
        String email = scanner.nextLine();
        System.out.println("enter your 10 digit phone number");
        long phone1 = scanner.nextLong();

        Contact contact = new Contact(name, email, phone1);
        System.out.println();
        System.out.println("contact created successfully :" + contact);

        Contact contact1 = new Contact("JON", "jon@gmail.com", 9898765650L);
        Contact finalMergeContactData = contact.mergeContactData(contact1);
        System.out.println();
        System.out.println("finalMergeContactData = "+ finalMergeContactData);

//        Contact contact1 = new Contact("JON","jon@gmail.com","9898765654");

        //randomCheck();

    }

    private static void randomCheck() {
        long number = 7658764534L;
        String phoneFormat = String.valueOf(number);
        String formatedPhoneNumber = String.format("(%s) %s-%s", phoneFormat.substring(0, 3), phoneFormat.substring(3, 6), phoneFormat.substring(6, 10));
        System.out.printf("formated phone number is %s", formatedPhoneNumber);
    }

}
