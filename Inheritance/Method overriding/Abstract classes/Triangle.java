public class Triangle extends Figure{
    Triangle(double b, double h) {
        super(b, h);
    }

    // overriding the area method
    double area() {
        System.out.println("Inside Area for Triangle");
        return 0.5 * dim1 * dim2;
    }
}