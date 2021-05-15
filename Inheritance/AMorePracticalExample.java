class Box {
    double width;
    double height;
    double depth;

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

// here Box is extended to include weight as well
class BoxWeight extends Box {
    double weight;

    // constructor for BoxWeight
    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

public class AMorePracticalExample {
    public static void main(String [] args) {
        BoxWeight b1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight b2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;

        vol = b1.volume();
        System.out.println("Volume of b1 is = " + vol);
        System.out.println("Weight of b1 is = " + b1.weight);
        System.out.println();

        vol = b2.volume();
        System.out.println("Volume of b2 is = " + vol);
        System.out.println("Weight of b2 is = " + b2.weight);
    }
}
