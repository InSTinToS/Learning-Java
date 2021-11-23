public class App {
    public static void main(String[] args) throws Exception {
        // abstract class cant be instantiated only extends
        // Animal miguel = new Animal("Ant miguel");

        Ant miguel = new Ant("Ant Miguel");
        System.out.println(miguel.getName());
    }
}
