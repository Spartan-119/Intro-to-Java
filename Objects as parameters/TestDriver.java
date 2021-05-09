public class TestDriver {
    public static void main (String [] args) {
        Test ob1 = new Test(100, 22);
        Test ob2 = new Test(100, 22);
        Test ob3 = new Test(1, 2);

        System.out.println("ob1 == ob2: " + ob1.isEqualTo(ob2));
        System.out.println("ob1 == ob3: " + ob1.isEqualTo(ob3));
    }
}
