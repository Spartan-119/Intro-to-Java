/*
In a class hierarchy, private members remain
private to their class.

This program contains an error and will not compile
 */

class A1{
    int i; // public by default
    private int j; // private to A

    void setij(int x, int y) {
        i = x;
        j = y;
    }
}

// A1's j is not accessible here
class B1 extends A1 {
    int total;

    void sum() {
        total = i + j; // ERROR, j is not accessible here
    }
}

public class MemberAccessAndInheritance {
    public static void main (String [] args) {
        B1 b = new B1();
        b.setij(10, 20);
        b.sum();

        System.out.println("Total is = " + b.total);
    }
}
