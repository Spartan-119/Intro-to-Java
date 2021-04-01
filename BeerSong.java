public class BeerSong {
    public static void main(String[] args){
        int beerNum = 99;
        String word = "bottles";

        // conditions
        while (beerNum > 0){
            if (beerNum == 1)
                word = "bottle"; // singular of bottles

            System.out.println(beerNum + " " + word + " of beer on the wall.");
            System.out.println("Take one and pass down the rest.\n");
            beerNum -= 1;
        }

        System.out.println("No more bottles of beer left on the wall mate!");
    }
}
