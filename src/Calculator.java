public class Calculator {
    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    private Floor floor;
    private Carpet carpet;

    public double getTotalCost(){
        return floor.getArea() * carpet.getCost();
    }

}


//org.opentest4j.AssertionFailedError: Field with name [length] not found. Fields found [width, height]. Tip: Check spelling. ==> expected: not <null>
//	at org.junit.jupiter.api.AssertionFailureBuilder.build(AssertionFailureBuilder.java:152)
//	at org.junit.jupiter.api.AssertionFailureBuilder.buildAndThrow(AssertionFailureBuilder.java:132)