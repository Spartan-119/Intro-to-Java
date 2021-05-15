public class DemoSuper {
    public static void main (String [] args) {
        BoxWeight myBox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight myBox3 = new BoxWeight(); // default one
        BoxWeight myCube = new BoxWeight(3, 2);
        BoxWeight myClone = new BoxWeight(myBox1); // clone of another object

        double vol;
        double weight;

        vol = myBox1.volume();
        weight = myBox1.weight;
        System.out.println("Volume of myBox1 is = " + vol);
        System.out.println("Weight of myBox1 is = " + weight);
        System.out.println();

        vol = myBox2.volume();
        weight = myBox2.weight;
        System.out.println("Volume of myBox2 is = " + vol);
        System.out.println("Weight of myBox2 is = " + weight);
        System.out.println();

        vol = myBox3.volume();
        weight = myBox3.weight;
        System.out.println("Volume of myBox3 is = " + vol);
        System.out.println("Weight of myBox3 is = " + weight);
        System.out.println();

        vol = myCube.volume();
        weight = myCube.weight;
        System.out.println("Volume of myCube is = " + vol);
        System.out.println("Weight of myCube is = " + weight);
        System.out.println();

        vol = myClone.volume();
        weight = myClone.weight;
        System.out.println("Volume of myClone is = " + vol);
        System.out.println("Weight of myClone is = " + weight);
        System.out.println();
    }
}
