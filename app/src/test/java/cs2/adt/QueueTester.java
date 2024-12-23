package cs2.adt;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

class QueueTester {
  private Queue<Integer> q;

  @BeforeEach
  void init() {
    q = new LinkedQueue<Integer>();
  }

  @Test
  void testEnDeOnce() {
    assertTrue(q.isEmpty());
    q.enqueue(7);
    assertFalse(q.isEmpty());
    assertEquals(q.peek(), 7);
    assertEquals(q.dequeue(), 7);
    assertTrue(q.isEmpty());
  }

  @Test
  void testEnDeMulti() {
    assertTrue(q.isEmpty());
    for(int i=0; i<100; i++) {
      q.enqueue(i);
      assertFalse(q.isEmpty());
      assertEquals(q.peek(), 0);
    }
    for(int i=0; i<100; i++) {
      assertEquals(q.peek(), i);
      assertEquals(q.dequeue(), i);
    }
    assertTrue(q.isEmpty());
  }

  @Test
  void testEnDeMultiTwice() {
    assertTrue(q.isEmpty());
    for(int i=0; i<100; i++) {
      q.enqueue(i);
      assertFalse(q.isEmpty());
      assertEquals(q.peek(), 0);
    }
    for(int i=0; i<100; i++) {
      assertEquals(q.peek(), i);
      assertEquals(q.dequeue(), i);
    }
    assertTrue(q.isEmpty());
    for(int i=0; i<100; i++) {
      q.enqueue(i);
      assertFalse(q.isEmpty());
      assertEquals(q.peek(), 0);
    }
    for(int i=0; i<100; i++) {
      assertEquals(q.peek(), i);
      assertEquals(q.dequeue(), i);
    }
    assertTrue(q.isEmpty());
  }


}
