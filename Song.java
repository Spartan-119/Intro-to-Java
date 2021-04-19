public class Song {
    String title;
    String artist;

    public void setTitle(String t) {
        title = t;
    }

    public void setArtist(String a) {
        artist = a;
    }

    public void play() {
        System.out.println("Playing the song " + this.title + " by " + this.artist);
    }

    public static void main(String [] args) {
        Song s1 = new Song();
        s1.setTitle("One");
        s1.setArtist("Metallica");
        s1.play();

        Song s2 = new Song();
        s2.setTitle("Snuff");
        s2.setArtist("Slipknot");
        s2.play();
    }
}
