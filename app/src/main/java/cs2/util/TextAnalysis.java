package cs2.util;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class TextAnalysis {
  public static HashSet<String> getWords(String filename) {
    HashSet<String> words = new HashSet<>();
    try {
      File f = new File(filename);
      Scanner in = new Scanner(f);
      while(in.hasNextLine()) {
        String line = in.nextLine().toLowerCase();
        String[] lineWords = line.split("\\s+");
        for(int i=0; i<lineWords.length; i++) {
          lineWords[i] = lineWords[i].replaceAll("[^A-Za-z]", "");
          words.add(lineWords[i]);
        }      
      }
    } catch(Exception e) {
      System.out.println("ERROR");
      e.printStackTrace();
    }
    //System.out.println(words);
    //System.out.println(words.size());
    return words;
  }

  public static HashMap<String,Integer> getWordCounts(String filename) {
    HashMap<String,Integer> words = new HashMap<>();
    try {
      File f = new File(filename);
      Scanner in = new Scanner(f);
      while(in.hasNextLine()) {
        String line = in.nextLine().toLowerCase();
        String[] lineWords = line.split("\\s+");
        for(int i=0; i<lineWords.length; i++) {
          lineWords[i] = lineWords[i].replaceAll("[^A-Za-z]", "");
          if(!words.containsKey(lineWords[i])) {
            words.put(lineWords[i], 1);
          } else {
            words.put(lineWords[i], 1 + words.get(lineWords[i]));
          }
        }      
      }
    } catch(Exception e) {
      System.out.println("ERROR");
      e.printStackTrace();
    }
    //System.out.println(words.size());
    return words;
  }


  public static void main(String[] args) {
    HashSet<String> tempestWords = getWords("tempest.txt");
    HashSet<String> midsummerWords = getWords("midsummer.txt");
    System.out.println(tempestWords.size());
    System.out.println(midsummerWords.size());

    tempestWords.removeAll(midsummerWords);
    System.out.println(tempestWords.size());
    System.out.println(tempestWords);

    HashMap<String, Integer> tempCounts = getWordCounts("tempest.txt");
    System.out.println(tempCounts);

    for(String k : tempCounts.keySet()) {
      if(tempCounts.get(k) > 100) {
        System.out.println(k + " -- " + tempCounts.get(k));
      }
    }


  }
}
