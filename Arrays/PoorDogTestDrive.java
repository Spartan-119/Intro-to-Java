public class PoorDogTestDrive {
    public static void main (String [] args) {
        int count = 0;
        int size = 10;
        PoorDog[] dog;
        dog = new PoorDog[3];

        String names[] = {"J", "M", "S"};

        while (count < 3) {
            dog[count] = new PoorDog();
            dog[count].setName(names[count] + "ack");
            dog[count].setSize(size);
            System.out.println(dog[count].getName());
            System.out.println(dog[count].getSize());
            System.out.println();

            count++;
            size += 20;
        }
    }
}
