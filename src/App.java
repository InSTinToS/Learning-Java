import java.nio.file.Files;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        // Stack: first in is the last out

        Stack<String> cars = new Stack<>();

        cars.push("HRV");
        cars.push("GOLF");
        cars.push("POLO");
        cars.push("CAMARO");

        System.out.println(cars);

        System.out.println(cars.peek()); // peek the top of stack

        System.out.println("remove top: " + cars.pop()); // return top element and remove it

        System.out.println(cars.peek());

        System.out.println(cars.empty());

        System.out.println("------------------------");

        // Queue: first in is the first out

        Queue<String> persons = new LinkedList<>();

        persons.add("Miguel");
        persons.add("Gabriel");
        persons.add("Jean");

        System.out.println(persons);

        System.out.println(persons.peek());

        System.out.println("remove top: " + persons.poll()); // equal pop

        System.out.println(persons.peek());

        System.out.println(persons.isEmpty());
    }
}
