public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    // method to start the game
    public void StartGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        // declaring 3 variables to "hold" the player's guesses
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        // declaring 3 variables to "hold" the boolean value of the player's guess
        boolean p1IsRight = false;
        boolean p2IsRight = false;
        boolean p3IsRight = false;

        // declaring the condition for the game loop to terminate/continue
        boolean gameIsOn = true;

        // declaring the target that the players have to guess
        int target = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9...");

        while (gameIsOn) { // the loop while go on until one of the player is correct
            System.out.println("The number to be guessed is " + target);

            System.out.print("I am Player 1 and ");
            p1.Guess();

            System.out.print("I am Player 2 and ");
            p2.Guess();

            System.out.print("I am Player 3 and ");
            p3.Guess();

            guessp1 = p1.number;
            guessp2 = p2.number;
            guessp3 = p3.number;

            if (guessp1 == target) {
                p1IsRight = true;
            }

            if (guessp2 == target) {
                p2IsRight = true;
            }

            if (guessp3 == target) {
                p3IsRight = true;
            }

            if (p1IsRight || p2IsRight || p3IsRight) {
                System.out.println("Let's find out who all guessed the correct number, shall we?!");
                System.out.println("Player 1 got it right? " + p1IsRight);
                System.out.println("Player 2 got it right? " + p2IsRight);
                System.out.println("Player 3 got it right? " + p3IsRight);
                System.out.println("This game is over!");
                break;
            }

            else {
                System.out.println("The players will have to try again");
            }

        }
    }
}
