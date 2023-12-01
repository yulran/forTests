import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {
    ReverseString reverseString;

    @Before
    public void setUp() throws Exception {
        reverseString= new ReverseString();
    }

    @Test
      public void Reverse() {
        String act= reverseString.Reverse("hello");
        String exp="olleh" ;
        assertEquals(exp,act);
    }
    @Test
    public void ReverseEmpty() {
        String act= reverseString.Reverse("");
        String exp="" ;
        assertEquals(exp,act);
    }
}