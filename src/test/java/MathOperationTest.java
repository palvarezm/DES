


import org.junit.Assert;
import org.junit.Test;


public class MathOperationTest {
	private MathOperation mathOperation;
	
	public MathOperationTest() {
		mathOperation = new MathOperation();
	}

	@Test
	public void add() {
		mathOperation.setFirstNumber(2);
		mathOperation.setSecondNumber(2);
		Assert.assertTrue(mathOperation.Add() == 4);
	}

	@Test
	public void substract() {
		mathOperation.setFirstNumber(5);
		mathOperation.setSecondNumber(2);
		Assert.assertTrue(mathOperation.Substract() == 3);
	}

	@Test
	public void multiply() {
		mathOperation.setFirstNumber(3);
		mathOperation.setSecondNumber(-5);
		Assert.assertTrue(mathOperation.Multiply() == -15);
	}

	@Test
	public void divide() {
		mathOperation.setFirstNumber(12);
		mathOperation.setSecondNumber(2);
		Assert.assertTrue(mathOperation.Divide() == 6);
	}

	@Test
	public void divideZero() {
		mathOperation.setFirstNumber(12);
		mathOperation.setSecondNumber(0);
		try {
			mathOperation.Divide();
		}
		catch(Exception e) {
			e.printStackTrace();
			Assert.fail("Test failed: " + e.getMessage());
		}
	}
}
