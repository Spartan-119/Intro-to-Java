public class BoxDriver {
    public static void main (String [] args) {
        Box b1 = new Box(10, 20, 30);
        Box b2 = new Box();
        Box b3 = new Box(7);

        // create copy of b1
        Box myClone = new Box(b1);

        double volume;

        // calculating the volume of b1
        volume = b1.getVolume();
        System.out.println("Volume of b1 is: " + volume);

        // calculating the volume of b2
        volume = b2.getVolume();
        System.out.println("Volume of b2 is: " + volume);

        // calculating the volume of b3
        volume = b3.getVolume();
        System.out.println("Volume of b3 is: " + volume);

        // calculating the volume of myClone
        volume = myClone.getVolume();
        System.out.println("Volume of myClone is: " + volume);

    }
}
