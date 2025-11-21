package ch05;

import java.util.Scanner;

public class EXSwitch {
	public static void main(String[] args) {

		// switch의 기본형
		// switch(비교값){
		// case 조건값1:
		// 비교값과 조건값1이 일치할때 실행할 문장.
		// break;
		// case 조건값2:
		// 비교값과 조건값2이 일치할때 실행할 문장.
		// break;
		// case 조건값3:
		// 비교값과 조건값3이 일치할때 실행할 문장.
		// break;
		// default:
		// 비교값과 일치하는 조건값이 없을때 실행할 문장.
		// break;
		// }
		Scanner sc = new Scanner(System.in);
		System.out.printf("달을 입력하세요 : ");
		int month = sc.nextInt();

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.printf("%d월은 31일 까지 있습니다.\n", month);
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.printf("%d월은 30일 까지 있습니다.\n", month);
			break;
		case 2:
			System.out.printf("%d월은 28일 까지 있습니다.\n", month);
			break;
		default:
			System.out.printf("%d월은 없습니다\n", month);
			break;
		}
		System.out.print("숫자 1개를 입력하세요 : ");
		int a = sc.nextInt();
		System.out.print("숫자 1개를 하나더 입력하세요 : ");
		int b = sc.nextInt();
		System.out.print("연산자를 입력하세요 : ");
		String op = sc.next();

		switch (op) {
		case "+":
			System.out.print("결과" + a + b);
			break;
		case "-":
			System.out.print(a - b);
			break;
		case "*":
			System.out.print(a * b);
			break;
		case "/":
			if (b == 0) {
				System.out.println("0으로 나눌 수 없습니다");
			} else if (a == 0) {
				System.out.println("0으로 나눌 수 없습니다");
			} else {
				System.out.println(a / b);
			}
			break;
		default:
			System.out.println("연산자를 잘못 입력했어요.");
		}

	}
}
