public class Box {
    private double width;
    private double height;
    private double depth;

    // construct clone of an object
    Box (Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // constructor used when all dimensions are specified
    Box (double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // constructor used when no dimensions are specified
    Box() {
        width = height = depth = -1;
    }

    // constructor used when a cube is mentioned
    Box(double size) {
        width = height = depth = size;
    }

    // method to calculate the volume of the Box
    double volume() {
        return width * height * depth;
    }
}
