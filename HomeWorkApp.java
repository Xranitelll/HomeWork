public class HomeWorkApp {
    public static void main(String[] args){
        printThreeWords();
        checkSumSign();
        checkSumSignTwo();
        printColor();
        printColorGreen();
        printColorYellow();
        compareNumbers();
        compareNumbersAnother();
    }

    // задание второе

    public static void printThreeWords(){
        System.out.println("_Orange");
        System.out.println("_Banana");
        System.out.println("_Apple");
    }

    // задание третье

    public static void checkSumSign(){
        int a = 10;
        int b = 15;
        int c = a + b;
        if (c >= 0){
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
            }
        }

        // Можо сделать строчку 15 следующим образом (может, какой-то из вариантов не верный)

    public static void checkSumSignTwo(){
            int a = 10;
            int b = -15;
            boolean c = ((a + b) >= 0);
            if (c){
                System.out.println("Сумма положительная");
            } else {
                System.out.println("Сумма отрицательная");
            }
        }

        // задание четвертое

    public static void printColor(){
        int value;
        value = 200;
        if (value <= 0){
            System.out.println("Красный");
        } else if (value > 0 && value <= 100){
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    // разные значения (Желтый)

    public static void printColorYellow(){
        int value;
        value = 40;
        if (value <= 0){
            System.out.println("Красный");
        } else if (value > 0 && value <= 100){
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    // разные значения (Зеленый)

    public static void printColorGreen(){
        int value;
        value = 200;
        if (value <= 0){
            System.out.println("Красный");
        } else if (value > 0 && value <= 100){
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    // задание пятое

    public static void compareNumbers(){
        int a = 80;
        int b = 80;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // Иной вариант

    public static void compareNumbersAnother(){
        int a = 20;
        int b = 80;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}