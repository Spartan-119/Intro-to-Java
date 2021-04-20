public class DogTestDrive {
    public static void main(String [] args) {
        // creating a new reference variable for the object of class Dog
        Dog[] pets;

        // making that reference variable an array object that can store 7 elements
        pets = new Dog[7];

        pets[0] = new Dog();
        pets[1] = new Dog();
        pets[2] = new Dog();
        pets[3] = new Dog();
        pets[4] = new Dog();
        pets[5] = new Dog();
        pets[6] = new Dog();

        int count = 0;
        int petSize = 10;
        while(count < 7) {
            pets[count].setSize(petSize);
            pets[count].getSize();
            pets[count].bark();

            count++;
            petSize += 10;
        }
    }
}
