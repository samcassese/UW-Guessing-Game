import java.util.*;

/*
Sam Cassese
11/28/22
Period 2
Guessing Game
*/

/*
notes:
- maybe solve procedurally first
*/

class Main {
  
  public static void main(String[] args) {

    // add random
    Random random = new Random();

    // max value for random number
    final int MAX = 100;
    
    // generates random value from 0-100;
    int rand = random.nextInt(MAX); 

    // add scanner
    Scanner scanner = new Scanner(System.in);

    // blank line for spacing
    System.out.println(); 

    System.out.println("I'm thinking of a number between 1 and 100...");

    // guess counter
    int guessCount = 0;

    Boolean gameOver = false;

    while (gameOver == false) {

      System.out.print("Your guess? ");

      int guess = scanner.nextInt();

      if (guess < rand) {
        guessCount++;
        System.out.println("It's higher");
      }

      else if (guess > rand) {
        guessCount++;
        System.out.println("It's lower");
      }

      else {
        guessCount++;
        System.out.println("You got it right in " + guessCount + " guesses!");

        gameOver = true;
        
      }
      
    }

    



    ///////// MY CODE //////////////////
    ////////////////
    // GuessingGame game = new GuessingGame();
    // game.gameLoop();
    ////////////////////
  
    // Can you make a Guessing Game Type that could be used to get 
    // each value from the overall results via accessor methods?

    // GG myGame = new GG("me");
    // System.out.println("Guess / game: " + myGame.getAvg());

    scanner.close();
    
  }
  
}