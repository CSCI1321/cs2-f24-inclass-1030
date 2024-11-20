package cs2.adt;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class StackTester {
  private Stack<Integer> s;
  @BeforeEach
  void init() {
    s = new ArrayStack<Integer>();
  }
  @Test
  void testPushPop() {
    assertEquals(s.isEmpty(), true);
    s.push(4);
    assertEquals(s.isEmpty(), false);
    s.push(8);
    s.push(12);
    assertEquals(s.peek(), 12);
    assertEquals(s.pop(), 12);
    assertEquals(s.pop(), 8);
    assertEquals(s.pop(), 4);
    assertEquals(s.isEmpty(), true);
    //assertEquals(s.pop(), null);
  }
}


