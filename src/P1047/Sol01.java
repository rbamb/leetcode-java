package P1047;

import java.util.Stack;

public class Sol01 implements Main {

  public String removeDuplicates(String S) {
    Stack<Character> stack = new Stack<>();
    stack.push(S.charAt(0));
    for (int i = 1; i < S.length(); i++) {
      if (stack.peek() == S.charAt(i)) stack.pop();
      else stack.push(S.charAt(i));
    }
    for (Character chr : stack) {
      System.out.print(chr);
    }
    System.out.println();
    return null;
  }
}
