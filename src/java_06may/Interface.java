package java_06may;

import java.util.*;
import java.util.function.Consumer;

public class Interface {
    public static void main(String[] args) {
//        groceryList();
//        Collections.synchronizedList(List.of(1,2,3,4));
        // linkedListExample();
        //arrayDequeImplExample();
        //  queueImplExample();
        //linkedListExampleStringBased();
        // stackExample();
        linkedListExample10May();
    }

    private static void linkedListExample10May() {
        List<Integer> myL = new LinkedList<>();
        myL.add(1);
        myL.add(12);
        myL.add(2);
        myL.add(24);
        myL.add(3);
        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random() * 100 * i);
            // System.out.print("item "+random+" ");
            myL.add(random);
        }
        System.out.println("original list: " + myL);
        System.out.println(myL.removeAll(List.of(1, 2, 3)));
        System.out.println("my created linked list : " + myL);
        ListIterator<Integer> m = myL.listIterator();
        //System.out.println(m.ne);

    }

    private static void stackExample() {
        var myStack = new Stack<Integer>();
        baseAddElementIntoList(myStack);
        System.out.println(myStack);
        myStack.pop();
        myStack.add(113);
        System.out.println(myStack.peek());
        System.out.println(myStack);
    }

    private static void baseAddElementIntoList(List<Integer> myList) {
        for (int i = 0; i < 10; i++) {
            double item = i + Math.random() * 100;
            //System.out.println("item to be added "+item);
            myList.add((int) item);
        }
    }

    private static void linkedListExampleStringBased() {
        var myLinkedList = new LinkedList<>(List.of("apple", "banana", "mango", "dragon fruit", "orange", "grapes", "pineapple"));
        myLinkedList.add("strawberry");
        System.out.println(myLinkedList);
        Collections.sort(myLinkedList);
        System.out.println("sorted list :: " + myLinkedList);
        // queue method implement
        System.out.println("peak element  :: " + myLinkedList.peek());
        myLinkedList.poll(); // apple
        System.out.println("poll :: " + myLinkedList);
        myLinkedList.pop();  // banana
        System.out.println("pop  :: " + myLinkedList);
        myLinkedList.addFirst("hey");
        System.out.println(myLinkedList);
        myLinkedList.addLast("ok");
        System.out.println(myLinkedList);
        System.out.println("element " + myLinkedList.element());
        System.out.println(myLinkedList);

//        Consumer<String> myConsumer = s -> System.out.printf("item get from linkedList is =>  %s\n",s);
//        myLinkedList.iterator().forEachRemaining(myConsumer);

        for (String s : myLinkedList) {
            System.out.println(s);
        }
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

        sortList(mylinkedList);
        System.out.printf("last index of item %d is : %d", 300, mylinkedList.lastIndexOf(300));
        System.out.println();
        System.out.println("sorted list " + mylinkedList);
    }

    private static void sortList(List<Integer> mylinkedList) {
        Comparator<Integer> myc = (o1, o2) -> {
            if (o1 < o2) {
                return -1;
            } else {
                return 1;
            }
        };
        mylinkedList.sort(myc);
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
