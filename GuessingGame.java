class GuessingGame {

  // properties
  String name;
  Boolean gameOver = false;


  // constructor
  public GuessingGame() {

    System.out.println("Game created");

  }


  // methods

  public void round(int guess, int num) {

    int guesses = 0;

    System.out.println("I'm thinking of a number between 1 and 100...");

    System.out.print("Your guess? ");

    if (guess < num) {
      guesses++;
      System.out.println("It's higher");
    }

    else if (guess > num) {
      guesses++;
      System.out.println("It's lower");
    }

    else {
      guesses++;
      System.out.println("You got it right in " + guesses + " guesses!");
      gameOver = true;
    }
    
  }

  public void gameLoop() {
    
    while(gameOver = false) {
      round(4, 4);
    }
    
  }

  
}