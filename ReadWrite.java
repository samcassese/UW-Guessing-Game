/*
Sam Cassese
12/12/22
Period 2
Guessing Game
*/

// read from file, find Sue's results

// update Sue's results

// write Sue's new results back to file

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
- rename "x" / "scanner" to "scanLn" / "scanFile"
*/

public class ReadWrite {

  private static final String FILE = "ledger.tsv";
  private static final String NAME = "Sue";

  public static void main(String[] args) throws FileNotFoundException {

    // 1.) read from file, find Sue's results

    // Sue has 3 result values; Games, Guesses, Best
    int games = 0;
    int guesses = 0;
    int best = 0;
    String oldData = "";

    File file = new File(FILE);
    Scanner scanner = new Scanner(file);

    while (scanner.hasNextLine()) {
      String thisLine = scanner.nextLine();
      Scanner x = new Scanner(thisLine);

      if (x.next().equals(NAME)) {
        // Sue's results
        games = x.nextInt();
        guesses = x.nextInt();
        best = x.nextInt();
        System.out.println(thisLine);
        // System.out.printf("%d %d %d \n", games, guesses, best);
      }

      else {
        oldData += thisLine + "\n";
      }
      
      x.close();
    }
    scanner.close();

    // 2.) update Sue's results

    // Sue plays game
    games++;
    guesses += 7;

    // Print results
    PrintStream ps = new PrintStream(FILE);
    ps.print(oldData);
    ps.println(NAME + "\t" + games + "\t" + guesses + "\t" + best);

    // 3.) write Sue's new results back to file

    System.out.println("I can read and write");

  }

}