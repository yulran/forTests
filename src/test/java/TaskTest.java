import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TaskTest {
    Task task;

    @Before
    public void setUp() throws Exception {
        task=new Task();
      // task.setname(" dan")
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test

    public void isUpperCaseNull(){
        boolean act=task.isUpperCase(null);
        boolean exp=false;
        assertEquals(exp,act);

    }
    @Test

    public void isUpperCaseEmpty(){
    boolean act=task.isUpperCase("");
    boolean exp=false;
    assertEquals(exp,act);

    }
    @Test

    public void isUpperCaseLow(){
        boolean act=task.isUpperCase("first");
        boolean exp=false;
        assertEquals(exp,act);

    }
    @Test

    public void isUpperCaseTrue(){
        boolean act=task.isUpperCase("FIRST");
        boolean exp=true;
        assertEquals(exp,act);

    }
    @Test

    public void isUpperCaseNum(){
        boolean act=task.isUpperCase("8");
        boolean exp=false;
        assertEquals(exp,act);

    }


}











