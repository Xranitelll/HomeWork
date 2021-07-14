import sun.nio.cs.ext.PCK;

import java.security.SignatureSpi;
import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    public static char[][] space;
    public static final int size = 5;
    public static final int winSpace = 4;
    public static final char emptySpace = '.';
    public static final char spaceX = 'X';
    public static final char spaceO = 'O';

    public static void main(String[] args){
        allSpace();
        makeSpace();

        while (true) {
            human();
            makeSpace();
            if (isWin(spaceX)) {
                System.out.println("Победил человек!");
                break;
            }
            if (isSpaceEnd()) {
                System.out.println("Ничья!");
                break;
            }
            pc();
            makeSpace();
            if (isWin(spaceO)) {
                System.out.println("Победил человек!");
                break;
            }
            if (isSpaceEnd()) {
                System.out.println("Ничья!");
                break;
            }
        }
        System.out.println("Игра окончена.");
    }

    public static void allSpace() {
        space = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                space[i][j] = emptySpace;
            }
        }
    }

    public static void makeSpace() {
        for (int i = 0; i <= size; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < size; j++) {
                System.out.print(space[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void human() {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;

        do {
            System.out.println("Введите координаты в формате X b Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!openSpace(x,y));
        space[y][x] = spaceX;
    }

    public static void pc() {
        Random random = new Random();
        int x;
        int y;

        do {
            x = random.nextInt(size);
            y = random.nextInt(size);
        } while (!openSpace(x,y));
        System.out.println("Компьютер сходил в точку " + (x + 1) + " " + (y + 1));
        space[y][x] = spaceO;
    }

    public static boolean openSpace(int x, int y) {
        if (x < 0 || x >= size || y < 0 || y > size) {
            return false;
        }

        if (space[y][x] == emptySpace) {
            return true;
        }
        return false;
    }

    public static boolean isWin(char symb) {
        if (space[0][0] == symb && space[0][1] == symb && space[0][2] == symb && space[0][3] == symb) {
            return true;
        }
        if (space[1][0] == symb && space[1][1] == symb && space[1][2] == symb && space[1][3] == symb) {
            return true;
        }
        if (space[2][0] == symb && space[2][1] == symb && space[2][2] == symb && space[2][3] == symb) {
            return true;
        }
        if (space[3][0] == symb && space[3][1] == symb && space[3][2] == symb && space[3][3] == symb) {
            return true;
        }
        if (space[4][0] == symb && space[4][1] == symb && space[4][2] == symb && space[4][3] == symb) {
            return true;
        }
        if (space[0][1] == symb && space[0][2] == symb && space[0][3] == symb && space[0][4] == symb) {
            return true;
        }
        if (space[1][1] == symb && space[1][2] == symb && space[1][3] == symb && space[1][4] == symb) {
            return true;
        }
        if (space[2][1] == symb && space[2][2] == symb && space[2][3] == symb && space[2][4] == symb) {
            return true;
        }
        if (space[3][1] == symb && space[3][2] == symb && space[3][3] == symb && space[3][4] == symb) {
            return true;
        }
        if (space[4][1] == symb && space[4][2] == symb && space[4][3] == symb && space[4][4] == symb) {
            return true;
        }



        if (space[0][0] == symb && space[1][0] == symb && space[2][0] == symb && space[3][0] == symb) {
            return true;
        }
        if (space[0][1] == symb && space[1][1] == symb && space[2][1] == symb && space[3][1] == symb) {
            return true;
        }
        if (space[0][2] == symb && space[1][2] == symb && space[2][2] == symb && space[3][2] == symb) {
            return true;
        }
        if (space[0][3] == symb && space[1][3] == symb && space[2][3] == symb && space[3][3] == symb) {
            return true;
        }
        if (space[0][4] == symb && space[1][4] == symb && space[2][4] == symb && space[3][4] == symb) {
            return true;
        }
        if (space[1][0] == symb && space[2][0] == symb && space[3][0] == symb && space[4][0] == symb) {
            return true;
        }
        if (space[1][1] == symb && space[2][1] == symb && space[3][1] == symb && space[4][1] == symb) {
            return true;
        }
        if (space[1][2] == symb && space[2][2] == symb && space[3][2] == symb && space[4][2] == symb) {
            return true;
        }
        if (space[1][3] == symb && space[2][3] == symb && space[3][3] == symb && space[4][3] == symb) {
            return true;
        }
        if (space[1][4] == symb && space[2][4] == symb && space[3][4] == symb && space[4][4] == symb) {
            return true;
        }


        if (space[3][0] == symb && space[2][1] == symb && space[1][2] == symb && space[0][3] == symb) {
            return true;
        }
        if (space[4][1] == symb && space[3][2] == symb && space[2][3] == symb && space[1][4] == symb) {
            return true;
        }
        if (space[4][0] == symb && space[3][1] == symb && space[2][2] == symb && space[1][3] == symb) {
            return true;
        }
        if (space[3][1] == symb && space[2][2] == symb && space[1][3] == symb && space[0][4] == symb) {
            return true;
        }
        if (space[1][0] == symb && space[2][1] == symb && space[3][2] == symb && space[4][3] == symb) {
            return true;
        }
        if (space[0][1] == symb && space[1][2] == symb && space[2][3] == symb && space[3][4] == symb) {
            return true;
        }
        if (space[0][0] == symb && space[1][1] == symb && space[2][2] == symb && space[3][3] == symb) {
            return true;
        }
        if (space[1][1] == symb && space[2][2] == symb && space[3][3] == symb && space[4][4] == symb) {
            return true;
        }
        return false;
    }

    public static boolean isSpaceEnd() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (space[i][j] == emptySpace) {
                    return false;
                }
            }
        }
        return true;
    }
}



