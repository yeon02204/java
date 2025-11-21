package ch04;
import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// 과수원이 있다.
		//
		// 배, 사과, 오렌지를 키우고 있는데 하루에 생산되는 양은 각각 5, 7, 5개이다.
		// 과수원에서 하루에 생산되는 총 개수를 출력하고, 시간당 전체 과일의 평균 생산 갯수를 출력하시오.
		// 평균값을 담는 변수는 float으로 할 것.
		int Pear = 5;
		int Apple = 7;
		int Orange = 5;

		int DaySum = Pear + Apple + Orange;
		float DayAvg = (float) DaySum / 24f;
		System.out.println("총갯수 : " + DaySum + "개");
		System.out.println("평균 : " + DayAvg + "개");

		// 상자 하나에는 농구공이 5개가 들어갈 수 있다.
		// 만일 농구공이 23개라면 몇개의 상자가 필요한가?
		int ball = 23;
		int box = ball % 5 == 0 ? ball / 5 : ball / 5 + 1;

		// 국어,영어,수학에 대한 점수를 키보드를 이용해 정수로 입력받고
		// 1. 세 과목에 대한 합계 출력하기
		// 2. 평균 출력하기 (합계/3.0)
		
		Scanner sc = new Scanner(System.in);
		int scoreKn, scoreEn, scoreMth;
		
		System.out.printf("국어점수: ");
		scoreKn = sc.nextInt();
		System.out.printf("영어점수: ");
		scoreEn = sc.nextInt();
		System.out.printf("수학점수: ");
		scoreMth = sc.nextInt();
		
		int scoreSum = scoreKn + scoreEn + scoreMth;
		float scoreAvg = (float)scoreSum / 3.0f;
		
		// System.out.println("합계 : " + scoreSum);
		System.out.println("평균 : " + scoreAvg);
		
		// 세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
		// 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일때 합격
		// 아니면 불합격
		
		String result = (scoreKn >= 40 && scoreEn >= 40 && scoreMth >= 40 && scoreAvg > 40) ? "합격" : "불합격";
		
		System.out.println("합격여부 : " + result);
		
	}

}
