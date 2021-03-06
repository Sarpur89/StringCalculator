package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void testEmptyString() {
		assertEquals(0, StringCalculator.add(""));
	}
	
	@Test
	public void testOneNumber() {
		assertEquals(1, StringCalculator.add("1"));
	}
	
	@Test
	public void testTwoNumbers() {
		assertEquals(3, StringCalculator.add("1,2"));
	}
	
	@Test
	public void testMultipleNumbers() {
		assertEquals(6, StringCalculator.add("1,2,3"));
	}
	
	@Test
	public void testNewLine() {
		assertEquals(6, StringCalculator.add("1,2\n3"));
	}
	
	@Test
	public void testNegative() {
		StringCalculator.add("-1");
	}
	
	@Test
	public void testBiggerThan1k() {
		assertEquals(2, StringCalculator.add("1001,2"));
	}
}