package java_03may;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;


    private int addToner(int tonerAmount) {
        this.tonerLevel += tonerAmount;
        if (tonerLevel < 0) {
            return -1;
        }

        return tonerLevel;
    }

    private int printPages(int pages) {
        return 1;
    }


}
