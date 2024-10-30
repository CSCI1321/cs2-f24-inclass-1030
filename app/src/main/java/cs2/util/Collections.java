package cs2.util;
import java.util.HashSet;

public class Collections {
  
  public static void main(String[] args) {
    HashSet<String> set = new HashSet<String>();
    System.out.println(set);

    set.add("Hello");
    set.add("Goodbye");
    set.add("Whatever");
    System.out.println(set);
    System.out.println(set.size());
    System.out.println(set.isEmpty());

    set.remove("Goodbye");
    set.add("Hello");
    set.remove("!!!!!");
    System.out.println(set);

    for(int i=0; i<set.size(); i++) {
      //This kind of loop doesn't word for a set -- there are no indexes
      //System.out.println(set.get(i));
    }


    set.clear();
    System.out.println(set);


  }


}
