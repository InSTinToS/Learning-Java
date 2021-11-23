import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int rowsSize = 3;
        int columnsSize = 5;

        int[][] numbers = new int[rowsSize][columnsSize];
        int[][] defaultSettedMatrix = { { 0, 1, 2, 3, 4 }, { 0, 1, 2, 3, 4 }, { 0, 1, 2, 3, 4 } };

        for (int i = 0; i < rowsSize; i++) {
            for (int j = 0; j < columnsSize; j++) {
                numbers[i][j] = new SecureRandom().nextInt(100);
            }
        }

        for (int i = 0; i < rowsSize; i++) {
            for (int j = 0; j < columnsSize; j++) {
                System.out.print(numbers[i][j] + "\t");
            }

            System.out.println();
        }

        System.out.println("-------------------");

        for (int[] row : defaultSettedMatrix) {
            // for repeat 3 times (size of row)

            for (int column : row) {
                // for repeat 5 times (size of column)

                System.out.print(column + "\t");
            }

            System.out.println();
        }
    }
}
