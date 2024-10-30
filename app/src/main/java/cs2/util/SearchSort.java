package cs2.util;

public class SearchSort {

  static class Student implements Comparable<Student> {
    public String name;
    public double gpa;
    public Student(String n, double g) { name = n; gpa = g;}
    public int compareTo(Student other) {
      return this.name.compareTo(other.name);
      //if(this.gpa < other.gpa) return -1;
      //if(this.gpa > other.gpa) return 1;
      //return 0;
    }
  }

  
  public static <T extends Comparable<T>> void bubbleSort(T[] a) {
    for(int i=0; i<a.length; i++) {
      for(int j=0; j<a.length-1-i; j++) {
        if(a[j].compareTo(a[j+1]) > 0 ) {
          T tmp = a[j];
          a[j] = a[j+1];
          a[j+1] = tmp;
        }
      }
    }
  }

  public static void main(String[] args) {
    Student[] s = { new Student("Sally", 4.0),
                    new Student("BillyBob", 3.5),
                    new Student("Tracy", 3.1) };
    bubbleSort(s);
    for(Student t : s) {
      System.out.print(t.name + ",");
    }
    System.out.println();


    Integer[] myArray = {4, 5, 1, 3, 9, 22, -4, 7};
    bubbleSort(myArray);
    for(int i : myArray) {
      System.out.print(i + ",");
    }

    Character[] ca = {'A', 'a', '1', 'Z', '$', ' ' };
    bubbleSort(ca);
    for(char i : ca) {
      System.out.print(i + ",");
    }
  }


}
