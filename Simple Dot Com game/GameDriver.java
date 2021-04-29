public class GameDriver {
    public static void main (String [] args) {
        Game dot = new Game();

        int [] locations = {2, 3, 4};
        dot.setLocationCells(locations);

        String userGuess = "2"; // make a fake user guess
        String result  = dot.checkYourself(userGuess);
        String testResult = "failed";

        if (result.equals("hit")) {
            testResult = "passed";
        }
        System.out.println(testResult);
    }
}
