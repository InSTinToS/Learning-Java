import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int arraySize = 5;
        int[] array = new int[arraySize];
        int[] defaultSettedArray = { 0, 3, 4, 1, 2, 5 };

        System.out.println("enter 5 numbers");

        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < array.length; i++)
            array[i] = keyboard.nextInt();

        keyboard.close();

        System.out.println("----------------------");

        // foreach
        for (int arrayValue : array)
            System.out.println(arrayValue);

        System.out.println("----------- Sort -----------");

        Arrays.sort(defaultSettedArray);

        for (int arrayValue : defaultSettedArray)
            System.out.println(arrayValue);

        System.out.println("----------- IndexOf -----------");

        System.out.println(Arrays.binarySearch(defaultSettedArray, 3));
        System.out.println(Arrays.binarySearch(defaultSettedArray, 9));
    }
}
