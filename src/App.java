import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        int n1 = 0;
        int n2 = 0;

        System.out.println("enter two numbers");
        n1 = keyboard.nextInt();
        n2 = keyboard.nextInt();

        System.out.println("the sum is: " + (n1 + n2));

        keyboard.close();
    }
}
