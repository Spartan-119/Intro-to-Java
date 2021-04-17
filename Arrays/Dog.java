public class Dog {
    String name;

    // Driver class
    public static void main(String [] args) {
        // making a Dog object and then accessing it
        Dog dog1 = new Dog();
        dog1.name = "Shelby";
        dog1.bark();

        // making a Dog array
        Dog[] myDogs = new Dog[3];

        // have to make a new object for each Dog array element
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = new Dog();

        myDogs[0].name = "Alfie";
        myDogs[1].name = "Polly";
        myDogs[2].name = "Luca";

        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            myDogs[x].eat();
            x += 1;
        }


    }

    // defining the bark method
    public void bark() {
        System.out.println(name + " says woof woof!");
    }

    public void eat() {
        System.out.println(name + " ate the mouse.\n");
    }
}
