import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

import anotherpackage.CombatCar;
import somepackage.Car;

public class App {
    public static void main(String[] args) throws Exception {
        CombatCar combatcar = new CombatCar("the best combat car", 30);

        // public can be accessed by anywhere
        System.out.println(combatcar.publics);

        // private only can be accessed inside class or using public methods
        System.out.println(combatcar.getPrivates());

        // and at the last protected can be accessed anywhere inside the package or
        // inside a class that extends (even outside class)

        // cant use this:
        // System.out.println(combatcar.protecteds);
        // because isnt in the same package and App not extends Car

        // inside CombatCar is possible to access protecteds because extends Car

        System.out.println(combatcar.getProtecteds());
    }
}
