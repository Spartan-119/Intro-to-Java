public class BoxWeight extends Box{
    double weight;

    // constructing Clone of an object
    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }

    // constructor when all parameters are specified
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    // default constructor
    BoxWeight() {
        super();
        weight = -1;
    }

    // constructor when a cube is created
    BoxWeight(double size, double m) {
        super(size);
        weight = m;
    }
}
