package P1047;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void test() {
    String s = "abbaca";
    String ans = "ca";
    Main main = new Sol03();
    String ret = main.removeDuplicates(s);
    assertEquals(ret, ans);
  }
}
