// this class is for overall results at the end i think
public class GG {
  
  // Creat properties for each value in the overal results
  // from the Guessing Game
  private String player;
  
  public GG(String player){
    
    this.player = player;
    welcome();
    
  }

  private void welcome(){
    System.out.println("WELCOME: " + this.player);
  }
  
}