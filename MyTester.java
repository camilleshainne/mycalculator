import static org.junit.Assert.*;
import org.junit.Test;

public class MyTester{
	
	/** FACTORIAL TESTS **/
	
	// 0! returns 1.
	@Test
	public void test_nFactorial_0(){
		MyCalculator calc = new MyCalculator();
		int actual = calc.nfactorial(0);
		assertEquals("0! = 1", 1, actual);
	}
	
	// 1! returns 1.
	@Test
	public void test_nFactorial_1(){
		MyCalculator calc = new MyCalculator();
		int actual = calc.nfactorial(1);
		assertEquals("1! = 1", 1, actual);
	}
	
	// 3! returns 6.
	@Test
	public void test_nFactorial_other(){
		MyCalculator calc = new MyCalculator();
		int actual = calc.nfactorial(3);
		assertEquals("3! = 6", 6, actual);
	}
}
