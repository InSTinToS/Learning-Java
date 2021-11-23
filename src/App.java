import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class App {
    public static void main(String[] args) throws Exception {
        // is key value object
        HashMap<Integer, String> cars = new HashMap<Integer, String>();

        cars.put(1, "Polo");
        cars.put(2, "Golf");
        cars.put(3, "Camaro");

        System.out.println(cars);
        System.out.println(cars.get(3));
        System.out.println(cars.values());
        System.out.println(cars.keySet());

        System.out.println("---------------------------------------");
        // is array with unique values
        HashSet<String> persons = new HashSet<String>();

        persons.add("Polo");
        persons.add("Polo");
        persons.add("Golf");

        System.out.println(persons);

        System.out.println("---------------------------------------");

        Iterator<String> it = persons.iterator();

        while (it.hasNext())
            System.out.println(it.next());
    }
}
