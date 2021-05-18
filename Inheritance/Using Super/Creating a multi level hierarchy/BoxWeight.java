public class BoxWeight extends Box{
    double weight;

    // constructing the clone of an object
    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }

    // constructor used when all the dimensions of the box are mentioned
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d); // calling the superclass constructor
        weight = m;
    }

    // constructor when no dimensions are mentioned
    BoxWeight() {
        super();
        weight = -1;
    }

    // constructor when a cube is mentioned
    BoxWeight (double size, double m) {
        super(size);
        weight = m;
    }
}
