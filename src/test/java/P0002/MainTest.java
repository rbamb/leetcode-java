package P0002;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  private ListNode createList(int... args) {
    ListNode head = new ListNode(-1);
    ListNode ret = head;
    for (int arg : args) {
      head.next = new ListNode(arg);
      head = head.next;
    }
    return ret.next;
  }

  private String listToString(ListNode lst) {
    StringBuilder ret = new StringBuilder();
    ListNode t = lst;
    while (t != null) {
      ret.append(t.val).append(",");
      t = t.next;
    }
    return ret.toString();
  }

  @Test
  public void addTwoNumbers() {
    ListNode l1 = createList(2, 4, 3);
    ListNode l2 = createList(5, 6, 4);
    ListNode ans = createList(7, 0, 8);
    Main main = new Naive();
    ListNode ret = main.addTwoNumbers(l1, l2);
    assertEquals(listToString(ret), listToString(ans));
  }
}

