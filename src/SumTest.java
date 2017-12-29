import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumTest {

	@Test
	public void testForaddNumberAndGetSum() {
		int x=10,y=20;
		Sum sumInstance = new Sum();
		int sum = sumInstance.addNumber(x,y);
		assertEquals(x+y,sum);
		
	}
	
	@Test
	public void testFornumbersSumPlusOne() {
		assertEquals(5, new Sum().addNumber(2, 2));
	}
}
