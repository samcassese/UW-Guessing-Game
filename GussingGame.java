/*
Sam Cassese
12/1/22
Period 2 
Guessing Game
*/

/*
Notes
11:32 / 15:00
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
  int guessCount = 0;

  // static strings
  // 
  // intro
  final String THINKING = "I'm thinking of a number between 1 and 100...";
  
  final String YOUR_GUESS  = "Your guess? ";
  final String HIGHER = "It's higher.";
  final String LOWER  = "It's lower.";

  final String GUESS_AMOUNT = "You got it right in " + guessCount + " guesses!";

  final String PLAY_AGAIN = "Do you want to play again? ";

  // what do i need
  static Scanner scanner = new Scanner(System.in); // get user input
  

  public static void main(String[] args){
    goals = args;  // NEEDED FOR TESTS TO PASS


    intro();

    // what do i need
    Random  random  = new Random(); // get random number
    
    playRound(scanner, random); 

    

    scanner.close();
  }

  // takes user input and generates random number to be guessed
  // plays single round of guessing game
  public static void playRound(Scanner scanner, Random random) {

    // a goal answer
    int goal = getGoal(10, 1); 

    int userAnswer = askUser();
    
    
    /*
    while(x != y) {
      // do things
    
    }
    */
    
  }

  public static int askUser() {
    System.out.println("Input: ");
    
    int userAnswer = scanner.nextInt();

    return userAnswer;
  }

  // prints introduction to program
  public static void intro() {
    System.out.println("Introduction"); // note add actual intro
  }
  
  // YOU WILL NEED TO USE THIS METHOD TO PICK TEST-PASSING RANDOM NUMBERS!!
  //
  // int random = random number we are guessing
  // int i = count (amount of rounds we are gonna play)
  private static int getGoal(int random, int i){
    int goal = random;
    if(i < goals.length) goal = Integer.parseInt(goals[i]);
    return goal;
  }
}