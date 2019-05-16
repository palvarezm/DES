

public class MathOperation {
	double firstNumber, secondNumber;
	
	public MathOperation() {
		firstNumber = 0;
		secondNumber = 0;
	}
	
	public MathOperation(double _firstNumber, double _secondNumber) {
		firstNumber = _firstNumber;
		secondNumber = _secondNumber;
	}
	
	public double Add() {
		return firstNumber + secondNumber;
	}
	
	public double Substract() {
		return firstNumber - secondNumber;
	}
	
	public double Multiply() {
		return firstNumber * secondNumber;
	}
	
	public double Divide() {
		double result = 0;
		try {
			if (secondNumber == 0) {
	            throw new ArithmeticException();
			}
			else {
				result = firstNumber/secondNumber;
			}
	    } catch (ArithmeticException ae) {
	        System.out.println("ArithmeticException occured!");
	    }
		return result;
	}

	public double getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}

	public double getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}
	
}
