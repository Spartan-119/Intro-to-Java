public class B extends A {
    int k;
    B (int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        System.out.println("i, j, and k: " + i + ", " + j + " and " + k + " respectively");
    }
}
