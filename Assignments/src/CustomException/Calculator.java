package CustomException;

public class Calculator {

	private int no1;
	private int no2;
	int result = 0;
	
	/**
	 * @return the no1
	 */
	public int getNo1() {
		return no1;
	}

	/**
	 * @param no1 the no1 to set
	 */
	public void setNo1(int no1) {
		this.no1 = no1;
	}

	/**
	 * @return the no2
	 */
	public int getNo2() {
		return no2;
	}

	/**
	 * @param no2 the no2 to set
	 */
	public void setNo2(int no2) {
		this.no2 = no2;
	}

	public int sum(int no1,int no2){
		result = no1 + no2;
		return result;
	}
	
	public int subtraction(int no1,int no2){
		result = no1 - no2;
		return result;
	}
	
	public int multiply(int no1,int no2){
		result = no1 * no2;
		return result;
	}
	
	public int division(int no1,int no2) throws CustomException{
		try {
			result = no1 / no2;
		} catch (ArithmeticException e) {
			throw new CustomException("can't divide by zero",e);
		}
		return result;
	}

}
