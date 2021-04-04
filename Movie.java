public class Movie {
    // instance variables
    String name;
    String genre;
    int rating;

    // methods
    void PlayIt(){
        System.out.println("Play the movie: " + name);
        System.out.println("The genre of this movie is: " + genre);
        System.out.println("Its rating is: " + rating);
    }
}

class MovieTestDrive{
    public static void main(String [] args){

        Movie m1 = new Movie();
        m1.name = "Equalizer";
        m1.genre = "Action";
        m1.rating = 8;
        m1.PlayIt();

        Movie m2 = new Movie();
        m2.name = "The Book of Eli";
        m2.genre = "Fiction";
        m2.rating = 9;
        m2.PlayIt();

        Movie m3 = new Movie();
        m3.name = "Conjuring";
        m3.genre = "Horror";
        m3.rating = 7;
        m3.PlayIt();
    }
}
