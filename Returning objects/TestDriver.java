public class TestDriver {
    public static void main (String [] args) {
        Test t1 = new Test(2);
        Test t2;

        t2 = t1.incrByTen();
        System.out.println("t1.a = " + t1.a);
        System.out.println("t2.a = " + t2.a);
        t2 = t2.incrByTen();
        System.out.println("t2.a after a second increase = " + t2.a);
    }
}
