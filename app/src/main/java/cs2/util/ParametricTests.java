package cs2.util;
import java.util.ArrayList;

public class ParametricTests {
  
  public static <T> ArrayList<T> arrayToList(T[] a) {
    ArrayList<T> al = new ArrayList<T>();
    for(T i : a) {
      al.add(i);
    }
    return al;
  }

  public static void main(String[] args) {
    Double[] myIntArray = { 1.1, 3.141, 4.0, 5.2 };
    System.out.println(arrayToList(myIntArray));
  }


}
