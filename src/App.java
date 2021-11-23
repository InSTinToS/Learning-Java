import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Consumer;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> values = new ArrayList<>();
        ArrayList<Integer> doubles = new ArrayList<>();
        ArrayList<Integer> odds = new ArrayList<>();
        ArrayList<Integer> evens = new ArrayList<>();

        Consumer<Integer> doubler = (value) -> {
            doubles.add(value * 2);
        };

        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);
        values.add(6);

        values.forEach(doubler);

        values.forEach((value) -> {
            if (value % 2 == 0)
                evens.add(value);
            else
                odds.add(value);
        });

        System.out.println(values);
        System.out.println(doubles);
        System.out.println(odds);
        System.out.println(evens);

    }
}
