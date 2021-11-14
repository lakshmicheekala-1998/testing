package testing;
import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;



public class divideTest {

	@Test
	public void testpositive() {
		JunitTesting test=new JunitTesting();
		int output=(int)test.divide(10, 2);
		assertEquals(5,output);
	}
	@Test(expected=ArithmeticException.class)
	public void testnegative() {
		JunitTesting test=new JunitTesting();
		test.divide(10, 0);
		
	}

}
