import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class polindromewordTest {
    polindromeword polindromeword;

    @Before
    public void setUp() throws Exception {
        polindromeword = new polindromeword();
    }

    @Test
    public void check() {
    }

    @Test
    public void isPalindromeTrue() {
        boolean act = polindromeword.isPalindrome("kayak");
        boolean exp = true;
        assertEquals(exp, act);
    }

    @Test
    public void isPalindromeNull() {
        boolean act = polindromeword.isPalindrome(null);
        boolean exp = false;
        assertEquals(exp, act);
    }

    @Test
    public void isPalindromeEmptyl() {
        boolean act = polindromeword.isPalindrome(" ");
        boolean exp = false;
        assertEquals(exp, act);
    }

}