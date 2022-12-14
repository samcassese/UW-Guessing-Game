/*
Sam Cassese
11/28/22
AP CS-A
Period 2
*/

import java.io.FileNotFoundException;

class Main {
  
  public static void main(String[] args) throws FileNotFoundException {

    // ReadWrite.main(args);

    Player sam = new Player("Sam");
    
    System.out.println(sam.getGames());
    
    int newGames = sam.getGames() + 1;
    sam.setGames(newGames);
    
    System.out.println(sam.getGames());

    // need to make this list < 1 string to actually pick random num
    //String a[] = {"31","64","49"}; // {"31","64","49"}

    // procedural
    //GussingGame.main(a);

    
    // object-oriented
    /*
    GG guessingGame = new GG("Sam");
    GG gg = new GG("Sue");
    System.out.println(guessingGame.getPlayer());
    System.out.println(gg.getPlayer());

    gg.playGame();
    gg.showResults();
    */
    
    
  }
  
}