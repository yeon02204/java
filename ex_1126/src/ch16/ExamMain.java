package ch16;

import java.util.Scanner;

public class ExamMain {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		Exam1 ex = new Exam1();

		System.out.println("최대값 : " + ex.maxFinder(arr));

		System.out.println("원의 넓이 :" + ex.circleArea(5));

		ex.circleRound(6);

		ex.fToc();

		System.out.println(ex.calc(2, 4, "*"));
		
		TimeTable tt = new TimeTable();
		
		tt.showTable(3);
	}

}
