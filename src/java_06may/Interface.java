package java_06may;

import java.util.*;

public class Interface {
    public static void main(String[] args) {
//        groceryList();
//        Collections.synchronizedList(List.of(1,2,3,4));
        linkedListExample();
        //arrayDequeImplExample();
        //  queueImplExample();
        linkedListExampleStringBased();

    }

    private static void linkedListExampleStringBased() {
        var myLinkedList = new LinkedList<String>(List.of("apple","banana","mango","dragonfruit",));

    }

    private static void arrayDequeImplExample() {
        /*
       queue based on first in first out (fifo)
         */
        Queue<Integer> myQue = new ArrayDeque<>();
        baseQueueImpl(myQue);
        System.out.println("queue implementation as ArrayDeque " + myQue);
        System.out.println("peak value int ArrayDeque :" + myQue.peek());
        //  myQue.poll();
        myQue.remove();
        // myQue.retainAll()
        System.out.println("queue implementation as ArrayDeque after remove " + myQue);
    }

    public static void baseQueueImpl(Queue<Integer> myQue) {
        myQue.add(200);
        myQue.add(39);
        for (int i = 0; i < 10; i++) {
            myQue.add(i);
        }
        myQue.add(17);
    }

    private static void queueImplExample() {
        Queue<Integer> myQue = new PriorityQueue<>();
        baseQueueImpl(myQue);
        System.out.println("return queue as PriorityQueue " + myQue);
        System.out.println("peak value int PriorityQueue :" + myQue.peek());
        myQue.poll();
        System.out.println("queue implementation as PriorityQueue after poll " + myQue);
    }

    private static void linkedListExample() {
        // List<Integer> mylinkedList = new LinkedList<>();
        var mylinkedList = new LinkedList<Integer>();
        mylinkedList.add(27);
        mylinkedList.add(300);
        for (int i = 0; i < 12; i++) {
            mylinkedList.add(i);
        }
        mylinkedList.add(-23);
        mylinkedList.add(-23);

        System.out.println(mylinkedList);
        // Collections.sort(mylinkedList);

        Comparator<Integer> myc = (o1, o2) -> {
            if (o1 < o2) {
                return -1;
            } else {
                return 1;
            }
        };
        mylinkedList.sort(myc);
        System.out.printf("last index of item %d is : %d", 300, mylinkedList.lastIndexOf(300));
        System.out.println();
        System.out.println("sorted list " + mylinkedList);
    }

    public static void groceryList() {
        ArrayList<String> myGroceryList = new ArrayList<>();
        Scanner myObj = new Scanner(System.in);
        System.out.println("Available actions:");
        System.out.println(0 + " to shutdown");
        System.out.println(1 + " to add items to list");
        System.out.println(2 + " to remove any items ");

        switch (myObj.nextInt()) {
            case 0 -> {

            }
            case 1 -> {
                String input = myObj.nextLine();
                boolean isItemAlreadyExistInList = myGroceryList.contains(input);
                if (!input.isBlank()) {
                    myGroceryList.add(input);
                }
                break;

            }
            case 2 -> {
                String input1 = myObj.next();
                myGroceryList.remove(input1);
            }
            default -> {
                throw new IllegalArgumentException("invalid input");
            }

        }

    }

}
