public class App {
    public static void main(String[] args) throws Exception {
        int[] array = { 0, 1, 2, 3, 4 };
        int variable = 0;

        changeArrayAndNotChangeVariable(array, variable);

        System.out.println(array[0]);
        System.out.println(variable);

    }

    public static void changeArrayAndNotChangeVariable(int[] sameArray, int variable) {
        sameArray[0] = 9999;
        variable = 9999;
    }
}
