package java_31may;

import java.util.*;

public class java_3june {
    public static void main(String[] args) {
//        Map<Integer,Integer> integerStringMap = new HashMap<>();
//        for (int i = 0; i < 10; i++) {
//            int random = (int) (Math.random()*100);
//            integerStringMap.put(i,random);
//        }
//        System.out.println(integerStringMap);
//        integerStringMap.put(0,123);
//        System.out.println(integerStringMap);
        ArrayList<Integer> m = new ArrayList<>();
       m.add(1);
       m.add(2);
       m.add(2);
       m.add(3);
       m.add(3);
       m.add(4);
        Set<Integer> m12  = new HashSet<>(m);
        System.out.println(m12);

    }
}
