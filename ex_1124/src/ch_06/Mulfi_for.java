package ch_06;

public class Mulfi_for {
	public static void main(String[] args) {
		// 중첩 for문 (다중 for문)
		// for(초기식; 조건식; 증감식){
		// 반복하고자 하는 명령
		// for(초기식; 조건식; 증감식){
		// 반복하고자 하는 명령
		// }
		// 반복하고자 하는 명령
		// }

		// for문의 성격
		// 1. 초기식 변수에 값을 하나 초기화 한다
		// 2. 변수의 값을 비교하여 조건이 참인지 검증을 한다
		// 3. 조건이 참이면 코드블럭({})안의 명령을 실행한다
		// 4. 명령을 모두 실행하면 증감식을 실행한다 (초기식 변수의 값이 변화됨)
		// 5. 변수를 다시 조건과 비교하여 참이면 3~5번 거짓이면 반복문을 빠져나간다

		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 4; j++) {
				System.out.printf("%d일 %d교시\n", i, j);
			}

		}
		
		System.out.println("------------------------");

		// 중첩 for문의 작동 원리
		// 1. outer for문이 1회 돌 때, inner for문은 모든 반복을 반복한다.
		// 2. inner for문의 모든 반복이 끝나면, outer for문의 증감식으로 돌아온다.
		// 3. outer for문의 조건식이 참이면 1-2번 반복, 거짓이면 반복문을 빠져나간다.

		// 두개의 주사위를 던졌을때 합이 6이 되는 모든 경우의 수를 출력하는 코드 작성하기

		for (int i = 1; i < 7; i++) {
			for (int j = 1; j < 7; j++) {
				if (i + j == 6) {
					System.out.printf("주사위 1: %d, 주사위 2: %d\n", i, j);
				}
			}
		}
		
		System.out.println("------------------------");
		
		// 구구단 2단부터 9단까지
		int dan ;
		
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				dan = i * j;
				System.out.printf("%d X %d = %d\n", i, j, dan);
			}
		}
		
		System.out.println("------------------------");
		
		// for문 -> 	배열과 관련이 깊다.
		
		
		
		
	} // 메인
} // 클래스
