public class App {
    public static void main(String[] args) throws Exception {
        Ant[] array = new Ant[5];

        array[0] = new Ant("Miguel");

        System.out.println(array[0].info());
    }
}
