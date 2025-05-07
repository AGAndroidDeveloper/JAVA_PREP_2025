package java_2may.class_composition;

public class Starter {
    public static void main(String[] args) {
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedRoom = new Bedroom("Ankit gupta", wall1, wall2, wall3, wall4, ceiling,bed, lamp);
        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();
    }
}

//org.opentest4j.AssertionFailedError: It doesn't print 'Bedroom -> Making bed | Bed -> Making | Lamp -> Turning on' ==> expected: <Bedroom -> Making bed | Bed -> Making | Lamp -> Turning on> but was: <the bed is being made
//lamp is being turned on
//>
//	at org.junit.jupiter.api.AssertionFailureBuilder.build(AssertionFailureBuilder.java:151)
//	at org.junit.jupiter.api.AssertionFailureBuilder.buildAndThrow(AssertionFailureBuilder.java:132)
//	at org.junit.jupiter.api.AssertEquals.failNotEqual(AssertEquals.java:197)
//	at org.junit.jupiter.api.AssertEquals.assertEquals(AssertEquals.java:182)
//	at org.junit.jupiter.api.Assertions.assertEquals(Assertions.java:1156)
//	at Evaluate$BedroomOutputTest.testBedroomStringOutput(Evaluate.java:185)
//	at java.base/java.lang.reflect.Method.invoke(Method.java:569)
//	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
//	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
//	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
//Coding Exercise