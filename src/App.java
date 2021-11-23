import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int[][] matrix = { { 2, 3, 1 }, { 3, 1, 3 }, { 1, 2, 3 } };

        printMatrix(matrix);
        System.out.println(sum(3, 1, 5, 6, 7));
        System.out.println(sum(3.0, 1.1, 5.5, 6.4, 7.3));
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int column : row)
                System.out.print(column + "\t");
            System.out.println();
        }
    }

    public static Double sum(Double... numbers) {
        Double sum = 0D;

        for (Double number : numbers)
            sum += number;

        return sum;
    }

    public static int sum(int... numbers) {
        int sum = 0;

        for (int number : numbers)
            sum += number;

        return sum;
    }

}
