public class Rectangle extends Figure{
    Rectangle(double a, double b) {
        super(a, b);
    }

    // overriding the area method
    double area() {
        System.out.println("Inside Area for Rectangle");
        return dim1 * dim2;
    }
}