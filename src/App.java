import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> array = new ArrayList<>(100);
        int variable = 0;

        array.add(variable);

        changeArrayAndNotChangeVariable(array, variable);

        array.trimToSize(); // remove index not used

        System.out.println(array.get(0));
        System.out.println(variable);

    }

    public static void changeArrayAndNotChangeVariable(ArrayList<Integer> sameArray, int variable) {
        sameArray.add(0, 1);
        variable = 9999;
    }
}
