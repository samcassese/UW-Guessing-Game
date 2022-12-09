/*
Sam Cassese
12/1/22
Period 2 
Guessing Game
*/


/*
Notes:
do result constants in GG.java file
combine askUserPlayAgain and askUser later on
look into using method and return boolean instead of hard coding for when player is still playing
also should probably look into why the tests are being weird
*/

/*
Multi-method class that plays a guessing game
*/

import java.util.Scanner;
import java.util.Random;
import java.lang.Integer;

class GussingGame {
  // NEEDED FOR TEST TO PASS
  private static String[] goals;

  // variables
  static int guessCount = 0;
  static Boolean playing = true;
  static int roundsPlayed = 0;
  // variables for best round
  static int guessCountRound = 0;
  static int guessCountBest = Integer.MAX_VALUE;
  // maximum value for random integers
  static int MAX = 100;

  // static strings
  // 
  // intro
  final static String THINKING = "I'm thinking of a number between 1 and 100...";
  //
  final static String YOUR_GUESS  = "Your guess? ";
  final static String HIGHER = "It's higher.";
  final static String LOWER  = "It's lower.";

  final static String PLAY_AGAIN = "Do you want to play again? ";

  // what do i need
  static Scanner scanner = new Scanner(System.in); // get user input
  static Random  random  = new Random(); // get random number

  public static void main(String[] args){
    goals = args;  // NEEDED FOR TESTS TO PASS

    
    playGame();


    results();

    scanner.close();
    
  }

  // takes user input and generates random number to be guessed
  // plays single round of guessing game
  public static void playRound(Scanner scanner, Random random) {

    guessCountRound = 0;

    intro();

    int randNum = random.nextInt(MAX) + 1;

    // a goal answer
    int goal = getGoal(randNum, 1); 
    

    int userAnswer = 0; // initializing variable

    
    while(userAnswer != goal) {

      userAnswer = askUser();

      if(userAnswer < goal) {
        System.out.println(HIGHER);
        guessCount++;
        guessCountRound++;
      }

      else if(userAnswer > goal) {
        System.out.println(LOWER);
        guessCount++;
        guessCountRound++;
      }

      else {
        guessCount++;
        guessCountRound++;
      }
      
    }

    final String GUESS_AMOUNT = "You got it right in " + guessCountRound + " guesses!";

    System.out.println(GUESS_AMOUNT);

    askUserPlayAgain();
    
    if(guessCountRound < guessCountBest) {
      guessCountBest = guessCountRound;
    }

    guessCountRound = 0;
    
  }
  

  public static int askUser() {
    System.out.print(YOUR_GUESS);
    
    int userAnswer = scanner.nextInt();
    scanner.nextLine(); 

    return userAnswer;
  }

  // asks user if they want to play again
  public static String askUserPlayAgain() {

    System.out.print(PLAY_AGAIN);
    String playAgain = scanner.nextLine();

    if(playAgain.startsWith("y") == false && playAgain.startsWith("Y") == false) {
      playing = false;
    }


    return playAgain;
      
  }

  public static void playGame() {
    playing = true;
    
    while(playing == true) {
      playRound(scanner, random);
      roundsPlayed++;
    }
    
  }

  // prints introduction to program
  public static void intro() {
    System.out.println();
    System.out.println(THINKING); 
  }

  // prints final results/stats from game
  public static void results() {

    double guessesPerGame = ((double)guessCount / (double)roundsPlayed);
    

    System.out.println("\n" + "Overall results:");
    System.out.printf("Total games = %d \n", roundsPlayed);
    System.out.printf("Total guesses = %d \n", guessCount);
    System.out.printf("Guesses/game = %f \n", guessesPerGame);
    System.out.printf("Best game = %d", guessCountBest);
    
  }
  
  // YOU WILL NEED TO USE THIS METHOD TO PICK TEST-PASSING RANDOM NUMBERS!!
  //
  // int random = random number we are guessing
  // int i = index of array of test passing solutions i guess idk whats happening
  private static int getGoal(int random, int i){
    
    // goal is random number 1-100
    int goal = random;

    // if i < length of goals list, picks from list of goals
    if(i < goals.length) goal = Integer.parseInt(goals[i]);

    
    return goal;
  }
}