package itcollege.excercises;

import static org.junit.Assert.*;

import org.junit.Test;

public class DigitsTest {

	@Test(timeout=1000)
	public void testProductSimple() {

		assertEquals(8, DigitPower.powerNumbers(222));
		assertNotEquals(6, DigitPower.powerNumbers(111));
		assertNotEquals(10, DigitPower.powerNumbers(999));
	}

	@Test
	public void testProductZero(){
		assertEquals(0, DigitPower.powerNumbers(0));
		assertEquals(1, DigitPower.powerNumbers(0x1));
	}
	@Test
	public void testProductNegative(){
		assertEquals(25, DigitPower.powerNumbers(-55));
		assertEquals(8, DigitPower.powerNumbers(-222));
		assertEquals(1, DigitPower.powerNumbers(-1));
	}
}
