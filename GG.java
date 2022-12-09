/*
Sam Cassese
12/7/22
Period 2
*/

/*
learning the difference between object-oriented and procedueral code
we are going to let the GG remember our past guesses
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GG {

  // Creat properties for each value in the overal results
  // from the Guessing Game
  //////////////////////
  // PROPERTIES
  //////////////////////
  private String player;
  private int totalGuesses;
  private int totalGames;
  private int bestGame;
  private int goal;
  private double guessesPerGame;

  //////////////////////
  // CONSTRUCTORS
  /////////////////////
  public GG(String player) throws FileNotFoundException {

    File f = new File("ledger.tsv");
    Scanner scanner = new Scanner(f);

    while(scanner.hasNextLine()) {
      
      if(player.equals(scanner.next())) {
        
        this.totalGames = scanner.nextInt();
        this.totalGuesses = scanner.nextInt();
        this.bestGame = scanner.nextInt();

        System.out.println("-------------");
        
      }
      
    }
    

    this.player = player;
    welcome();


  }

  ///////////////////////
  // METHODS
  //////////////////////

  /*
  public void playRound() {
    intro();
    this.guess = playerGuess();
    this.totalGames++;

    while(needHint()) {
      this.guess = playerGuess();
    }
    return score;
  }
  */

  /*
  private boolean needHint() {
    if (goal < guess) System.out.println(LOW);
    else if (goal > guess) System.out.println(HIGH);
    else System.out.printf(CORRECT, this.score);

    return goal != guess;
  }
  */

  public void showResults() {

    guessesPerGame = totalGuesses / totalGames;

    System.out.println("\n" + "Results for " + this.player + ":");
    System.out.printf("Total games = %d \n", this.totalGames);
    System.out.printf("Total guesses = %d \n", this.totalGuesses);
    System.out.printf("Guesses/game = %f \n", this.guessesPerGame);
    System.out.printf("Best game = %d", this.bestGame);
    
  }

  /*
  public void playGame() {
    bestGame = playRound();
    while(playerPlays()) {
      score = playGame();
      if(bestGame > score) bestGame = score;
      this.avg = (double) totalGuess / totalGames;
    }
    printSummary();
  }
  */
  
  public String getPlayer() {
    return player;
  }

  public void setPlayer(String player) {
    this.player = player;
  }

  public int getTotalGuesses() {
    return totalGuesses;
  }

  public void setTotalGuesses(int totalGuesses) {
    this.totalGuesses = totalGuesses;
  }

  public int getTotalGames() {
    return totalGames;
  }

  public void setTotalGames(int totalGames) {
    this.totalGames = totalGames;
  }

  public int getGoal() {
    return goal;
  }

  public void setGoal(int goal) {
    this.goal = goal;
  }

  private void welcome() {
    System.out.println("WELCOME: " + this.player);
  }

}