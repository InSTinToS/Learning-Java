public class App {
    public static void main(String[] args) throws Exception {
        int cont = 10;

        // continue stop the current interaction e move to next
        // break stop the current and all nexts interactions
        for (int i = 0; i < cont; i++) {
            if (i % 2 == 0)
                continue;
            System.out.println(i);
        }

        System.out.println("---------------------");

        for (int i = 0; i < cont; i++) {
            if (i == 5)
                break;
            System.out.println(i);
        }
    }
}
