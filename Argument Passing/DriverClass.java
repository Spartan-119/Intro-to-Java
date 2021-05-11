public class DriverClass {
    public static void main (String [] args) {
        // Call by Reference
        CallByReference ob1 = new CallByReference(15,20);

        System.out.println("Call by Reference");
        System.out.println("ob1.a and ob1.b before call: " + ob1.a + " and " + ob1.b);
        ob1.meth(ob1);
        System.out.println("ob1.a and ob1.b after call: " + ob1.a + " and " + ob1.b + "\n");

        // call by value
        System.out.println("Call by Value");
        CallByValue ob2 = new CallByValue();
        int a = 2, b = 3;
        System.out.println("a and b before call: " + a + " and " + b);
        ob2.meth(a, b);
        System.out.println("a and b before call: " + a + " and " + b);
    }
}
