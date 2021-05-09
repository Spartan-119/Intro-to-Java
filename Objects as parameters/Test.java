public class Test {
    int a, b;

    Test(int i, int j) {
        this.a = i;
        this.b = j;
    }

    // return true if o is equal to the invoking object
    boolean isEqualTo(Test o) {
        if (o.a == a && o.b == b) return true;
        else return false;
    }
}
