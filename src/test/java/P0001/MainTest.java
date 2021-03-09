package P0001;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void test() {
    int[] nums1 = {2, 7, 11, 15};
    int target1 = 9;
    int[] ans1 = {0, 1};
    Main main = new Naive();
    int[] res1 = main.twoSum(nums1, target1);
    assertArrayEquals(res1, ans1);
  }
}
