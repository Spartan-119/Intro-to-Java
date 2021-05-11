public class CallByReference {
    int a, b;

    // constructor
    CallByReference(int i, int j) {
        a = i;
        b = j;
    }

    // pass an object
    void meth (CallByReference o) {
        o.a *= 2;
        o.b *= 2;
    }
}
