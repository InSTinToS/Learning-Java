import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Car car1 = new Car("Car");

        car1.setLigado(true);
        car1.info();
    }
}
