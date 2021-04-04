public class Dog {
    // instance variables
    int size;
    String breed;
    String name;

    // methods
    void Bark(){
        System.out.println("Woof! Woof!");
    }
}

class DogTestDrive{
    public static void main(String [] args){
        // creating objects of the Dog class to test it
        Dog d = new Dog();
        d.size = 40;
        d.Bark();
    }
}
