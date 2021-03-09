package P0003;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void lengthOfLongestSubstring() {
    String input1 = "abcabcbb";
    int ans1 = 3;
    Main main = new Sol01();
    int ret1 = main.lengthOfLongestSubstring(input1);
    assertEquals(ret1, ans1);

    String input2 = "pwwkew";
    int ans2 = 3;
    int ret2 = main.lengthOfLongestSubstring(input2);
    assertEquals(ret2, ans2);
  }
}
