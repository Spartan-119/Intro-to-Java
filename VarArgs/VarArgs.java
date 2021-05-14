public class VarArgs {
    static void vaTest(int ... v) {
        System.out.println("Number of arguments: " + v.length + "\nAnd the contents are:");
        for (int i : v) {
            System.out.println(i);
        }
    }

    public static void main (String [] args) {
        vaTest(10);
        vaTest(1, 2, 3);
        vaTest();
    }
}
