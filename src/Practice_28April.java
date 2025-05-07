public class Practice_28April {

    public static double convertToCentimeters(int heightInInches) {
        // convert inch to cm and return
        System.out.println("convertToCentimeters("+heightInInches * 2.54+")");
        return heightInInches * 2.54;
    }

    public static double convertToCentimeters(int heightInFeet, int heightInInch2) {
        int heightInInches = heightInFeet * 12+heightInInch2;
        System.out.println("heightInInch::"+heightInInches);
        return convertToCentimeters(heightInInches);
    }

}
