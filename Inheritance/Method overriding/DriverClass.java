public class DriverClass {
    public static void main (String [] args) {
        B b = new B(1, 2, 3);
        System.out.println("This will invoke the void method in B class: ");
        b.show();
    }
}
