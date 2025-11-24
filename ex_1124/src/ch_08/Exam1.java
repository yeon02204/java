package ch_08;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력받은 문자열의 문자 갯수 세기
		System.out.print("문자를 입력하세요 :");
		String str = sc.next();
		int j = 0;
		while (j < str.length()) {
			j++;
		}
		System.out.println("문자열 길이: " + j);

		// 문자열 입력받고 a찾아서 a 갯수 새기
		System.out.print("문자를 입력하세요 :");
		String str2 = sc.next();
		int count = 0;
		for (int i = 0; i < str2.length(); i++) {

			char ch = str2.charAt(i);
			if (ch == 'a') {
				count++;
			}
		}
		System.out.println("a 갯수 : " + count);

		// 문자열 입력받고 뒤집어서 출력
		System.out.print("문자를 입력하세요 :");
		String str3 = sc.next();
		String backlol = " ";
		for (int i = str3.length() - 1; i >= 0; i--) {
			backlol += str3.charAt(i);
		}
		System.out.print("정상 문자열 : " + str3);
		System.out.print("뒤집힌 문자열 : " + backlol);

		// 이메일 아이디 추출하기
		System.out.print("문자를 입력하세요 :");
		String email = sc.next();
		String id = email.substring(0,email.indexOf("@"));
		System.out.println(id);
	} // 메인
} // 클래스
