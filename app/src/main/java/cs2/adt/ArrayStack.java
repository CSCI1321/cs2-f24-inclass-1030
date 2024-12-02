package cs2.adt;

import java.util.EmptyStackException;

public class ArrayStack<T> implements Stack<T> {
  //Fields
  public T[] arr;
  private int len;

  //Constructor
  public ArrayStack() {
    arr = (T[]) new Object[10];
    len = 0;
  }

  
  public void push(T elem) {
    if(arr.length == len) {
      T[] tmp = (T[]) new Object[len*2];
      for(int i=0; i<len; i++) {
        tmp[i] = arr[i];
      }
      arr = tmp;
    }
    arr[len] = elem;
    len++;
  }
  public T pop() {
    if(isEmpty()) throw new EmptyStackException();
    len--;
    return arr[len];
  }
  public T peek() {
    if(isEmpty()) throw new EmptyStackException();
    return arr[len-1];
  }
  public boolean isEmpty() {
    return len == 0;
  }
  
  /*
  //Methods
  public void push(T elem) {
    T[] tmp = (T[]) new Object[arr.length + 1];
    tmp[arr.length] = elem;
    for(int i=0; i<arr.length; i++) {
      tmp[i] = arr[i];
    }
    arr = tmp;
  }
  public T pop() throws EmptyStackException {
    if(isEmpty()) throw new EmptyStackException();
    T[] tmp = (T[]) new Object[arr.length-1];
    for(int i=0; i<tmp.length; i++) {
      tmp[i] = arr[i];
    }
    T retVal = arr[arr.length-1];
    arr = tmp;
    return retVal;
  }
  public T peek() throws EmptyStackException {
    if(isEmpty()) throw new EmptyStackException();
    return arr[arr.length-1];
  }
  public boolean isEmpty() {
    return arr.length == 0;
  }
  */
}
