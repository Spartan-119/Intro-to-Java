class A {
    int i, j;

    void showij() {
        System.out.println("i = " + i + " and j = " + j);
    }
}

class B extends A {
    int k;

    void showk() {
        System.out.println("k = " + k);
    }

    void sum() {
        System.out.println("i + j + k = " + i + j + k);
    }
}

public class InheritanceBasics {
    public static void main (String [] args) {
        A superobj = new A();
        B subobj = new B();

        // the superclass may be used by itself.
        superobj.i = 10;
        superobj.j = 20;
        System.out.println("Contents of superobj: ");
        superobj.showij();
        System.out.println();

        // the subclass has access to all public members of its superclass
        subobj.i = 7;
        subobj.j = 8;
        subobj.k = 9;
        System.out.println("Contents of subobj: ");
        subobj.showij();
        subobj.showk();
        System.out.println();

        System.out.println("Sum of i, j, and k in subobj: ");
        subobj.sum();
    }
}
