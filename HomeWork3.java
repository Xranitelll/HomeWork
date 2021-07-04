import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 0, 1, 1, 0, 1, 1, 0};
        int[] newArr;
        newArr = new int[100];
        int[] someNewArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < 100; i++)
            newArr[i] = (i + 1);

        int[][] brandNewArr = {{8, 5, 3}, {2, 7, 0}, {3, 1, 4}};
        int[] numberMass = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        newNubers(arr);
        multiplicNumbers(someNewArr);
        changeDiagNumbers(brandNewArr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newArr));
        System.out.println(Arrays.toString(someNewArr));
        for (int i = 0; i < brandNewArr.length; i++) {
            System.out.println(Arrays.toString(brandNewArr[i]));
        }
        System.out.println(Arrays.toString(returnNumbers(10,5)));
        System.out.println(Arrays.toString(numberMass));
    }

    public static void newNubers(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
    }

    public static void multiplicNumbers(int[] someNewArr) {
        for (int i = 0; i < someNewArr.length; i++)
            if (someNewArr[i] <= 6) {
                someNewArr[i] = someNewArr[i] * 2;
            }
    }

    public static void changeDiagNumbers(int[][] brandNewArr) {
        for (int i = 0; i < brandNewArr.length; i++) {
            for (int j = 0; j < brandNewArr[0].length; j++) {
                if ((i + j) % 2 == 0) {
                    brandNewArr[i][j] = 1;
                }
            }
        }
    }

    public static int[] returnNumbers (int len, int initialValue) {
    int[] veryNewMass = new int[len];
    for (int i = 0; i < veryNewMass.length; i++) {
        veryNewMass[i] = initialValue;
    } return veryNewMass;
    }

    }