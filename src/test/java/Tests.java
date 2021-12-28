import org.junit.Test;
import static org.junit.Assert.*;
 
public class Tests {

    @Test
    public void test1() {
	String test = "Run test 1";
        System.out.println(test);
	assertEquals("Run test 1", test);
    }

    @Test
    public void test2() {
 	String test = "Run test 2";
        System.out.println(test);
	assertEquals("Run test 2", test);
    }

    @Test
    public void test3() {
	String test = "Run test 3";
        System.out.println(test);
	assertEquals("Run test 3", test);
    }
}