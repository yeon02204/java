package ex_abstract;

public class GoodCalc extends Calculator {

	// 합 구하기
	public int add(int x, int y) {
		return x + y;
	}

	// 차 구하기
	public int sub(int x, int y) {
		return x - y;
	}

	// 평균 구하기
	public double avg(int[] x) {
		int sum = 0;

	    for (int value : x) {   
	        sum = add(sum, value); 
	    }

	    return (double) sum / x.length;
	    }
}
