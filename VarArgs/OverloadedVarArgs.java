public class OverloadedVarArgs {
    // 1st vararg method
    static void vaTest(int ... v) {
        System.out.println("vaTest(int ... v): " +
                 "Number of args: " + v.length +
                 "\nContents: ");

        for (int i : v) {
            System.out.println(i + " ");
        }
        System.out.println();
    }

    // 2nd overloaded vararg method
    static void vaTest(boolean ... v) {
        System.out.println("vaTest(boolean ... v): " +
                "Number of args: " + v.length +
                "\nContents: ");

        for (boolean i : v) {
            System.out.println(i + " ");
        }
        System.out.println();
    }

    // 3rd overloaded varargs method
    static void vaTest(String msg, int ... v) {
        System.out.println("vaTest(String, int ... v): " +
                 msg +
                "Number of args: " + v.length +
                "\nContents: ");

        for (int i : v) {
            System.out.println(i + " ");
        }
        System.out.println();
    }

    public static void main(String [] args) {
        vaTest(1, 2, 3);
        vaTest("Testing: ", 10, 20);
        vaTest(true, false, false);
    }
}
