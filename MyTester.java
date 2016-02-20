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
	
	/** BINARY SEARCH TESTS **/
	
	// value is on the left side.
	@Test
	public void test_binarySearch_left(){
		MyCalculator calc = new MyCalculator();
		int a[] = {1,2,3,4,5};
		int actual = calc.binarySearch(1);
		assertEquals("Searched 1 in a[0].", 0, actual);
	}
	
	// value is on the right side.
	@Test
	public void test_binarySearch_left(){
		MyCalculator calc = new MyCalculator();
		int a[] = {1,2,3,4,5};
		int actual = calc.binarySearch(5);
		assertEquals("Searched 5 in a[4].", 4, actual);
	}
	
	// value is on the middle.
	@Test
	public void test_binarySearch_left(){
		MyCalculator calc = new MyCalculator();
		int a[] = {1,2,3,4,5};
		int actual = calc.binarySearch(3);
		assertEquals("Searched 3 in a[2].", 2, actual);
	}
	
	// value is not on the array.
	@Test
	public void test_binarySearch_left(){
		MyCalculator calc = new MyCalculator();
		int a[] = {1,2,3,4,5};
		int actual = calc.binarySearch(0);
		assertEquals("0 not found in the array a[].", -1, actual);
	}
}
