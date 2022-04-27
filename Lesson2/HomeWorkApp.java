// п. 1
public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords ();
        checkSumSign ();
        printColor();
        compareNumbers();
    }

    // п. 2
    public static void printThreeWords () {
        System.out.println ("Orange\nBanana\nApple");
    }

    // п. 3
    public static void checkSumSign () {
        int a = 10;
        int b = -20;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // п. 4
    public static void printColor() {
        int value = 100;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // п. 5
    public static void compareNumbers() {
        int a = -1;
        int b = 1;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}


