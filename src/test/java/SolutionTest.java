import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution solution;


    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void twoSum() {
        int[] n = new int[]{1, 4, 5, 6};
        int[] act = solution.twoSum(n, 9);
        int[] exp = {1, 2};
        assertArrayEquals(exp, act);
    }

    @Test
    public void twoSumfalse() {
        int[] n = new int[]{1, 4, 5, 6};
        int[] act = solution.twoSum(n, 9);
        int[] exp = {0, 2};
       assertNotEquals(exp, act);
    }
    @Test
    public void twoSumNull() {
        int[] n = new int[]{};
        int[] act = solution.twoSum(n, 9);
        int[] exp =solution.twoSum(null, 9); ;
        assertNotEquals(exp, act);
    }
}