import java.util.HashMap;
import java.util.Map;


public class Java_17june {
    public enum WeekDays {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        createMap(frequencyMap);
        System.out.println(frequencyMap);
        // if this key is not present in the map then put the key with value in the map
        frequencyMap.putIfAbsent("Ankit Gupta", -1);
        System.out.println(frequencyMap);

        System.out.println(frequencyMap);
        
        frequencyMap.compute(WeekDays.MONDAY.name(), (key, value) -> value+1);
//        frequencyMap.computeIfAbsent();
//        frequencyMap.computeIfPresent();

    }

    private static void createMap(Map<String, Integer> frequencyMap) {
        WeekDays[] keysList = WeekDays.values();
        for (WeekDays key : keysList) {
            int value = (int) (Math.random() * 100);
            frequencyMap.put(key.name(), value);
        }
    }

}
