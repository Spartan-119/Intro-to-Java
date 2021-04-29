public class Game {
    int [] locationCells;
    int guess;
    int numOfhits = 0;
    boolean gameIsOn = true;

    // getter to return a hit, miss, or kill verdict
    String checkYourself(String userGuess) {
        guess = Integer.parseInt(userGuess);
        String result = "miss";

        for (int cell : locationCells) {
            if (guess == cell) {
                result = "hit";
                numOfhits++;
                break;
            }
        }

        if (numOfhits == locationCells.length) {
            result = "kill";
        }

        System.out.println(result);
        return result;
    }

    // setter that takes an int array
    void setLocationCells(int [] loc) {
        locationCells = loc;
    }

}
