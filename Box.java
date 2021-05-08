public class Box {
    double width;
    double length;
    double height;

    // constructor
    Box(double w, double l, double h) {
        this.width = w;
        this.length = l;
        this.height = h;
    }

    // the method that does the same job as the constructor
    double setVolume(double w, double l, double h) {
        this.width = w;
        this.length = l;
        this.height = h;

        return this.width * this.length * this.height;
    }

    double Volume() {
        return this.width * this.length * this.height;
    }
}
