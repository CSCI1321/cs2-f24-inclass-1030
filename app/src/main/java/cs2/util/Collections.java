package cs2.util;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

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
    Iterator<String> it = set.iterator();
    while(it.hasNext()) {
      System.out.println(it.next());
    }
    it = set.iterator();
    while(it.hasNext()) {
      System.out.println(it.next());
    }
    for(String s : set) {
      System.out.println(s);
    }

    ArrayList<Integer> al = new ArrayList<Integer>();
    al.add(1);
    al.add(7);
    al.add(23);
    Iterator<Integer> it2 = al.iterator();
    while(it2.hasNext()) {
      System.out.println(it2.next());
    }
    for(Integer i : al) {
      System.out.println(i);
    }


    set.clear();
    System.out.println(set);


  }


}
