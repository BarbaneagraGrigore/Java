package udemy;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = ((tonerLevel > -1) && (tonerLevel <= 100)) ? tonerLevel : -1;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if ((tonerAmount + tonerLevel) > 100) {
                return -1;
            } else {
                return tonerLevel += tonerAmount;
            }
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = (duplex) ? (Math.round((float) pages / 2)) : pages;
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return this.pagesPrinted;
    }
}
//    public void fillToner(int quantity) {
//        if (tonerLevel > -1 && tonerLevel < 100) {
//            if ((tonerLevel + quantity) <= 100) {
//                this.tonerLevel += quantity;
//                System.out.println("Toner level: " + tonerLevel);
//            } else {
//                System.out.println("Toner level exceeds 100 %. Please fill with: " + (100 - tonerLevel));
//            }
//        } else {
//            System.out.println("Please insert a toner level between 0 and 99.");
//        }
//        if (tonerLevel >= 100) {
//            System.out.println("Toner is full: " + tonerLevel);
//        }
//    }

