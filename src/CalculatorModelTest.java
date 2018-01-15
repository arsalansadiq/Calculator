import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorModelTest {
	double a,b,result;
	CalculatorModel model;
	
	@Before
	public void setUp() throws Exception {
		a=8;
		b=2;
		result=0;
		model = new CalculatorModel();
	}

	@After
	public void tearDown() throws Exception {
	}

	

	
	@Test
	public void testAdd() {
		
		assertEquals(a+b,model.Add(a, b),a-b);
	}

	@Test
	public void testSubtract() {
		assertEquals(a-b,model.Subtract(a, b),a-b);
	}

	@Test
	public void testMultiply() {
		assertEquals(a*b,model.multiply(a, b),a-b);
	}

	@Test
	public void testDivide() {
		assertEquals(a/b,model.divide(a, b),a-b);
	}

}
