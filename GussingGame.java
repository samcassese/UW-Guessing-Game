

// REMEMBER COMMENTS!!!!


class GussingGame {
  // NEEDED FOR TEST TO PASS
  private static String[] goals;

  public static void main(String[] args){
    goals = args;  // NEEDED FOR TESTS TO PASS

    System.out.println("GUESSING GAME STARTS HERE");

    
  
  }


  
  // YOU WILL NEED TO USE THIS MATHOD TO PICK TEST-PASSING RANDOM NUMBERS!!
  private static int getGoal(int random, int i){
    int goal = random;
    if(i < goals.length) goal = Integer.parseInt(goals[i]);
    return goal;
  }
}