public class Box {
    double width;
    double length;
    double height;

    // pass OBJECT to constructor
    Box (Box ob) {
        this.width = ob.width;
        this.length = ob.length;
        this.height = ob.height;
    }

    // second type of constructor with no parameter
    Box() {
        this.width = -1;
        this.length = -1;
        this.height = -1;
    }

    // a third type of constructor that is tailored towards a CUBE
    Box(double side) {
        this.width = this.length = this.height = side;
    }

    // a fourth type of constructor to accept arbitrary values
    Box (double w, double h, double l) {
        this.width = w;
        this.length = l;
        this.height = h;
    }

    // method to calculate the volume
    double getVolume() {
        return this.width * this.length * this.height;
    }
}
