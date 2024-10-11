package cs2.hello;

import java.io.File;
import java.util.Scanner;

public class FileLoader {
  public static void main(String[] args) {
    
    
    try {
      File f = new File("SomeFile2.txt");
      Scanner sc = new Scanner(f);
      System.out.println(sc.nextLine());

      sc.close();
    } catch(Exception ex) {
      System.out.println("ERROR happened");
      ex.printStackTrace();
    }

  }
}
