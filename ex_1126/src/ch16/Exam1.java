package ch16;

import java.util.Scanner;

public class Exam1 {

	// 배열의 최대값을 찾는 maxFinder메서드 만들기
	// 최대값을 찾아서 반환하기

	public int maxFinder(int[] x) {
		int max = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] > max) {
				max = x[i];
			}
		}
		return max;
	}

	// 원의 넓이를 구하는 circleArea 메서드 만들기
	// 원의 넓이 : 3.14 * r * r

	public double circleArea(double r) {
		double pi = 3.14;
		double circle = pi * r * r;
		return circle;
	}

	// 원의 둘레를 구하는 circleRound 메서드 만들기
	// 원의 둘레 : 2 * 3.14 * r
	public void circleRound(double r) {
		double pi = 3.14;
		double circle = 2 * pi * r;

		System.out.println("원의 둘레 :" + circle);
	}

	// 화씨를 섭씨로 바꾸는 fToc
	// 섭씨 : (화씨-32)/1.8
	public void fToc() {
		Scanner sc = new Scanner(System.in);
		System.out.print("화씨를 입력하세요 : ");
		double Do = sc.nextDouble();
		double s = (Do - 32) / 1.8;

		System.out.println("섭씨는 : " + s + "도 입니다");

	}

	// 숫자두개와 연산자를 매개변수로 받아서 사칙연산으 하는 calc 메서
	public int calc(int x, int y, String c) {
		int result = 0;
		switch (c) {
		case "+":
			result = x + y;
			break;
		case "-":
			result = x - y;
			break;
		case "*":
			result = x * y;
			break;
		case "/":
			result = x / y;
			break;
		default:
			System.out.print("연산자 +,-,*,/ 중 1개로입력하세요");
			break;
		}
		return result;
	}

}
