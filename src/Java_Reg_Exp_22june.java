import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java_Reg_Exp_22june {
    public static void main(String[] args) {

//        MyKotlin28june obj = new MyKotlin28june(12, "Ankit Gupta",24);
//        System.out.println(obj.sum());

//        String a1 = "Hello World";
//        String formt = "my name is %s and my age is  %s".formatted("Ankit Gupta", "25");
//        int row = 5;
//        int col = 5;
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < i + 1; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        System.out.printf(formt);
//        System.out.println();
//        System.out.printf("formated using printf => %s", a1);

        // System.out.println(formate("Ankit gupta", "_", "3", "@", "#"));
        // System.out.println(matcher("aaab"));


//        String[] patterns = {
//                // character
//                "abc",
//                "123",
//                "A"
//        };

//        String[] patterns = {
//                // character
//                "ab|bc",
//                "[123]",
//                "[A]",
//                "[.]"
//        };

        regexFun08July();

    }

    private static void regexFun08July() {
        String[] patterns = {
                // character
                "[a-z]",
                "[0-9]",
                "[A-Z]",
                "b*2",
                "b+"
        };

        String testString = "Anyone can learn abc's, 123's, bb and any r.egular expression ";
        String replacement = "(-)";

        for (String pattern : patterns) {
            String output = testString.replaceFirst(pattern, replacement);
            System.out.printf(" pattern = %s : output is => %s", pattern, output);
            System.out.println();
        }
    }

    private static boolean matcher(String input) {
        Pattern mPattern = Pattern.compile("a3*b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = mPattern.matcher(input);
        return matcher.matches();
    }

    private static String formate(String regx, String... arg) {
        int index = 0;
        while (regx.matches("%s")) {
            regx = regx.replaceFirst("%s", arg[index++]);
        }

        return regx;
    }
}
