abstract class Printer{
    String model;
    int printedCount;
    int availableCount;
    abstract boolean print();

    public Printer (String model, int availableCount){
        this.model = model;
        this.availableCount = availableCount;
        this.printedCount = 0;
    }

}

class InkjetPrinter extends Printer {

    public InkjetPrinter(String model, int availableCount){
        super(model, availableCount);
    }

    @Override
    boolean print() {
        if (availableCount > 0){
            availableCount--;
            printedCount++;
            return true;
        } else if (availableCount == 0) {
            System.out.printf("%s: %d매째 인쇄 실패 - 잉크 부족.\n", model, printedCount + 1);
            return false;
        }
        else {
            return false;
        }
    }
}

class LaserPrinter extends Printer {

    public LaserPrinter(String model, int availableCount){
        super(model, availableCount);
    }

    @Override
    boolean print() {
        if (availableCount > 0){
            availableCount--;
            printedCount++;
            return true;
        } else if (availableCount == 0) {
            System.out.printf("%s: %d매째 인쇄 실패 - 토너 부족.\n", model, printedCount + 1);
            return false;
        }
        else {
            return false;
        }
    }
}

public class Homework7 {
    public static void main(String[] args) {
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T730DW", 7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);
        while (inkjet.print());
        while (laser.print());
    }
}
