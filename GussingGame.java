/*
Sam Cassese
12/1/22
Period 2 
Guessing Game
*/

/*
Notes:
time to add if/else logic
do result constants in GG.java file
combine askUserPlayAgain and askUser later on
*/

// REMEMBER COMMENTS!!!!

/*
Multi-method class that plays a guessing game
*/

import java.util.Scanner;
import java.util.Random;

class GussingGame {
  // NEEDED FOR TEST TO PASS
  private static String[] goals;

  // variables
  static int guessCount = 0;

  // static strings
  // 
  // intro
  final static String THINKING = "I'm thinking of a number between 1 and 100...";
  
  final static String YOUR_GUESS  = "Your guess? ";
  final static String HIGHER = "It's higher.";
  final static String LOWER  = "It's lower.";

  final static String PLAY_AGAIN = "Do you want to play again? ";

  // what do i need
  static Scanner scanner = new Scanner(System.in); // get user input
  

  public static void main(String[] args){
    goals = args;  // NEEDED FOR TESTS TO PASS


    intro();

    // what do i need
    Random  random  = new Random(); // get random number
    
    playRound(scanner, random); 


    // results();

    scanner.close();
  }

  // takes user input and generates random number to be guessed
  // plays single round of guessing game
  public static void playRound(Scanner scanner, Random random) {

    // a goal answer
    int goal = getGoal(10, 1); 
    

    int userAnswer = 0; // initializing variable

    
    while(userAnswer != goal) {

      userAnswer = askUser();

      if(userAnswer < goal) {
        System.out.println(HIGHER);
        guessCount++;
      }

      else if(userAnswer > goal) {
        System.out.println(LOWER);
        guessCount++;
      }

      else {
        guessCount++;
      }
      
    }

    final String GUESS_AMOUNT = "You got it right in " + guessCount + " guesses!";

    System.out.println(GUESS_AMOUNT);

    askUserPlayAgain();
    
    
    
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

    // if playAgain startsWith y
    // continue to do playRound

    // else
    // end playRound
    if(playAgain.startsWith("y") ) {
      System.out.print("Answer starts with y");
    }


    return playAgain;
      
  }

  public static void playGame() {
    playRound(scanner, random);
  }

  // prints introduction to program
  public static void intro() {
    System.out.println();
    System.out.println(THINKING); 
  }

  // prints final results/stats from game
  public static void results() {

    System.out.println("\n" + "Overall results:");
    System.out.printf("Total games = 3 \n");
    System.out.printf("Total guesses = 17 \n");
    System.out.printf("Guesses/game = 5.7 \n");
    System.out.printf("Best game = 4");
    
  }
  
  // YOU WILL NEED TO USE THIS METHOD TO PICK TEST-PASSING RANDOM NUMBERS!!
  //
  // int random = random number we are guessing
  // int i = index of array of test passing solutions i guess idk whats happening
  private static int getGoal(int random, int i){
    int goal = random;
    if(i < goals.length) goal = Integer.parseInt(goals[i]);
    return goal;
  }
}