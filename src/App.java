import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("access Static before create instace: " + Player.alert);

        Player miguel = new Player("Miguel Andrade", 19);

        miguel.setName("Miguel Andrade Barreto");

        System.out.println(Player.alert);

        miguel.age = 20;

        System.out.println(miguel.getName() + miguel.age);

    }
}
