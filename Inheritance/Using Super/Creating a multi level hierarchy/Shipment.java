// Extend BoxWeight to include shipping cost

public class Shipment extends BoxWeight{
    double cost;

    // constructing a clone of the object
    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }

    // constructor used when all parameters are specified
    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m); // calling the superclass constructor
        cost = c;
    }

    // constructor used when no parameters are specified
    Shipment() {
        super();
        cost = -1;
    }

    // constructor when a cube is given
    Shipment(double size, double m, double c) {
        super(size, m);
        cost = c;
    }
}
