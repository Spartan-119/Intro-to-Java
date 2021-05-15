public class Box {
    private double width;
    private double height;
    private double depth;

    // construct clone of an object
    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // constructor used when all dimensions are specified
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // constructor used when no dimensions are mentioned
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // constructor used when cube is created
    Box(double size) {
        width = height = depth = size;
    }

    // computing volume of the box
    double volume() {
        return width * height * depth;
    }
}
