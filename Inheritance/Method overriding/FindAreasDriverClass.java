public class FindAreasDriverClass {
    public static void main(String [] args) {
        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);

        Figure figref;

        figref = f;
        System.out.println(figref.area() + "\n");

        figref = r;
        System.out.println("Area of the rectangle is = " + figref.area() + "\n");

        figref = t;
        System.out.println("Area of the triangle is = " + figref.area());
    }
}
