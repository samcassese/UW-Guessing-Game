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

import java.util.*;

class GussingGame {
  // NEEDED FOR TEST TO PASS
  private static String[] goals;

  // static strings for intro
  // go here
  //

  public static void main(String[] args){
    goals = args;  // NEEDED FOR TESTS TO PASS


    intro();

    // what do i need
    Scanner scanner = new Scanner(System.in); // get user input
    Random  random  = new Random(); // get random number
    
    playRound(scanner, random); 

    

    scanner.close();
  }

  // takes user input and generates random number to be guessed
  // plays single round of guessing game
  public static void playRound(Scanner scanner, Random random) {
    
  }

  // prints introduction to program
  public static void intro() {
    System.out.println("Introduction"); // note add actual intro
  }
  
  // YOU WILL NEED TO USE THIS MATHOD TO PICK TEST-PASSING RANDOM NUMBERS!!
  private static int getGoal(int random, int i){
    int goal = random;
    if(i < goals.length) goal = Integer.parseInt(goals[i]);
    return goal;
  }
}