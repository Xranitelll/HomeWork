public class HomeWork2 {
    public static void main(String[] args) {
        boolean N = first(7, 8);
        System.out.println(N);
        numberPrint(20);
        boolean X = compNum(-4);
        System.out.println(X);
        printLineNTimes(0, "Вот это сообщение");
        boolean Y = whatIsTheYear(16);
        System.out.println(Y);
    }

    // Задание первое

    public static boolean first(int a, int b) {
        int c = (a + b);
        return (10 <= c && c <= 20);
    }

    // Задание второе

    public static void numberPrint(int number) {
        if (number < 0) {
            System.out.println("Это отрицательно число");
        } else {
            System.out.println("Это положительное число");
        }
    }

    // задание третье

    public static boolean compNum(int a) {
        if (a < 0) {
            return true;
        } else
            return false;
    }

    // задание четвертое

    public static void printLineNTimes(int count, String message) {
        int counter = 5;
        while (count < counter) {
            System.out.println(message);
            count++;
        }
    }

    // задание пятое*

    public static boolean whatIsTheYear(int b) {
        boolean vesYear = b % 4 == 0;
        boolean vesYearToo = b % 400 == 0;
        boolean flag = b % 100 == 0;

        if (vesYear && !flag || vesYearToo) {
            return true;
        } else {
            return false;
        }
    }
}
