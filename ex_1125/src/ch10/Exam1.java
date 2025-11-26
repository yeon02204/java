package ch10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// 단일 문자 배열에 단어와 숫자를 섞어 넣는다.
		char[] cards = { '1', 'L', 'O', '2', 'V', '3', 'E' };
		String myWord = "";

		// 알파벳만 출력
		for (int i = 0; i < cards.length; i++) {
			if ((cards[i] >= 'A' && cards[i] <= 'Z') || (cards[i] >= 'a' && cards[i] <= 'z')) {
				myWord += cards[i];

			}
		}
		System.out.println(myWord);

		// 키보드에서 배열의 길이를 입력 받는다
		// 입력받은 배열의 길이만큼 알파벳을 요소로 넣고
		// 배열의 길이를 정해주세요 :
		// 입력 : 5
		// 출력 : A B C D E

		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이를 정해주세요 : ");
		char[] length = new char[sc.nextInt()];

		char ch = 'A';
		for (int i = 0; i < length.length; i++) {
			length[i] = ch++;
		}
		System.out.println(Arrays.toString(length));

		int[] coin = { 500, 100, 50, 10 };

		// 변수 money에 10 ~ 5000사이의 난수를 발생시켜 넣는다.
		int money = (new Random().nextInt(500)+1) * 10;
		// 단 1의자리는 반드시 0이 되도록 한다.
		int tenOut = 0;

		tenOut = money / 10;
		money = tenOut * 10;
		System.out.println(money);
		// ex) 3450, 2100, 60

		// 발생된 난수 money를 동전으로 바꾸면 각 동전이 몇개씩 필요한지 출력

		for (int i = 0; i < coin.length; i++) {
			int res = money / coin[i]; // 이 동전 몇 개 필요한지
			System.out.println(coin[i] + "원 : " + res + "개");
			money %= coin[i]; // 남은 금액 갱신
		}

		// 가능한 적은 수의 동전을 사용한다.

		// 정답코드
//		int[] coin = { 500, 100, 50, 10 };
//
//		int money = (new Random().nextInt(500) + 1) * 10;
//
//		System.out.println("금액 : " + money);
//
//		for (int i = 0; i < coin.length; i++) {
//			int res = money / coin[i];
//			System.out.println(coin[i] + "원 : " + res + "개");
//			money %= coin[i];
//		}
		
		 //배열의 모든 요소의 합 구하기
	     int[][] arr = {
	    		   {1,2,3},
	    		   {4,5,6,7,8},
	    		   {9},
	    		   {10,11,12,13},
	    		   {14,15},
	    		   {16,17,18,19,20}
	    		       };
	       
	     int sum = 0;
		 for (int i = 0; i < arr.length; i++) {
			 for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			 }
			 
		}
		 System.out.println("총합 : " + sum);
		
		 int[] lotto = new int[6];
		 
		 outer : for (int i = 0; i < lotto.length;) {
			 lotto[i] = new Random().nextInt(45)+1;
			 for (int j = 0; j < i; j++) {
				 if(lotto[i] == lotto[j]) {
					 continue outer;
				 } 
			 }
			 System.out.print(lotto[i]+" ");
			 i++;
			 
			 
			 
		 }

	} // 메인

} // 클래스
