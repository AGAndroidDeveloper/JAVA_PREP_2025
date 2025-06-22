package java_13june;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final String locationDescription;
    private final Map<Character, String> keyPlaces;

    public Location(String locationDescription) {
        this.locationDescription = locationDescription;
        keyPlaces = new HashMap<>();
    }

    public void addPlaces(char key, String value) {
        if (!keyPlaces.containsKey(key)) {
            keyPlaces.put(key, value);
        }
    }

    @Override
    public String toString() {
        return "Location \n{" +
                " locationDescription='" + locationDescription + '\'' +
                ", keyPlaces=" + keyPlaces +
                "\n "+'}';
    }
}
