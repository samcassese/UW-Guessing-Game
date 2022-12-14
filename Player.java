import java.util.Scanner;

public class Player {
  /////////////
  // PROPERTIES
  /////////////
  String name;
  int games;
  int guesses;
  int best;

  //////////////
  // CONSTRUCTORS
  //////////////
  public Player(String name) {
    this.name = name;
  }

  public Player(String name, int games, int guesses, int best) {
    this.name = name;
    this.games = games;
    this.guesses = guesses;
    this.best = best;
  }

  public Player(String record, boolean parseLine) {
    if(parseLine) {
      Scanner s = new Scanner(record);
      this.name = s.next();
      this.games = s.nextInt();
      this.guesses = s.nextInt();
      this.best = s.nextInt();
      s.close();
    }
    else this.name = record;
  }

  /////////////
  // METHODS
  ////////////
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getGames() {
    return games;
  }

  public void setGames(int games) {
    this.games = games;
  }

  public int getGuesses() {
    return guesses;
  }

  public void setGuesses(int guesses) {
    this.guesses = guesses;
  }

  public int getBest() {
    return best;
  }

  public void setBest(int best) {
    this.best = best;
  }

}