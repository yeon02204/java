package ex_abstract;

public abstract class Calculator {
	int x;
	int y;
	
	// 합 구하기
	public abstract int add(int x, int y);
	
	// 차 구하기
	public abstract int sub(int x, int y);
		
	// 평균 구하기
	public abstract double avg(int[] x);

}
