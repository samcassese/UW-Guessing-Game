import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Data {
  
  public static final String FILE = "ledger.tsv";

  private Scanner fileScanner;
  private PrintStream ps;
  
  private String records = "";
  private String player;
  private Player p;

  public Data() {
    loadFile();
  }

  public Data(String player) {
    this.player = player;
    loadFile();
    readPlayer();
  }
  

  private void loadFile() {
    try {
      this.fileScanner = new Scanner(new File(FILE));
    } 
    catch (FileNotFoundException e) {
      System.out.printf("\"%s\" could not be found...\n", FILE);
    }
  }

  public Player readPlayer() {
    
    if(this.player == null) return null;
    String pRecord;
    Scanner recordScn;

    while (fileScanner.hasNextLine()) {
      
      pRecord = fileScanner.nextLine();
      recordScn = new Scanner(pRecord);
      
      if(player.equals(recordScn.next())) {
        this.p = new Player(pRecord, true);
      }
        
      else {
        this.records += (pRecord + "\n");
      }
      
    }

    return this.p;
    
  }

  public Player getPlayer(String player) {
    this.player = player;
    loadFile();
    return readPlayer();
  }

  public void updateRecord() {
    if(this.player == null) return;
    String record = 
      player + "\t" + p.getGames() + "\t" + p.getGuesses() + "\t" + p.getBest();

    this.records += record;
    
    try{
      ps = new PrintStream(new File(FILE));
      ps.println(records);
    }
    catch(FileNotFoundException e) {
      System.out.println("Eror");
    }
    
  }
  
}