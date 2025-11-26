package ch05;

public class If {

	public static void main(String[] args) {
		// if의 기본형
		// if (조건식) { 조건식이 참일때 실행할 명령};
		
		// 만약 실행해야하는 명령이 하나라면 중괄호를 생략 할 수 있다
		// if(조건식) 조건식이 참일때 실행할 명령;
		
		int score = 93;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다");
		}
		if(score < 90) {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다");
		}
		
		
		
		// 정수형 변수 x가 10보다 크고 20보다 작을때 true인 조건식 만들기
		int x = 15;
		
		if(10 < x && 20 > x) {
			System.out.println(true);
		}
		// char 문자형 변수ch 가 x 또는 X 일때 true인 조건식
		char ch = 'X';
		if(ch == 'x'|| ch == 'X') {
			System.out.println(true);
		}
		
		// 문자형 변수 ch가 알파벳일때 true인 조건
		
		if((ch >= 'a' && ch <= 'z')||(ch >= 'A' && ch <= 'Z')){
			System.out.println(true);
		}
		
		// if else
		// if(조건식){
		// 조건식이 참일때 실행할 명령
		// }else{
		// 조건식이 거짓일때 실행할 명령
		// }
		
		// if else
		// if(조건식1){
		// 조건식1이 참일때
		// }else if(조건식2){
		// 조건식1이 거짓이고 2가 참일때
		// }else if(조건식3){
		// 조건식1,2가 거짓이고 3이 참일때
		// }else if(조건식4){
		// 조건식1,2,3이 거짓이고 4가 참일때
		// }else{
		// 어느 조건도 맞지 않을때
		// }
		
		
		
		int a = 5;
		int b = 7;
		int c = 1;
		
		if(a > b && a > c) {
			System.out.println("a가 가장 큽니다");
		}else if( b > a && b > c) {
			System.out.println("b가 가장 큽니다");
		}else {
			System.out.println("c가 가장 큽니다");
		}
		
		
		String id = "admin";
		String pw = "1234";
		
		boolean result = id.equals("admin");
		// 아이디 비번이 일치하면 성공 아니면 실패 출력
		
		if (id.equals("admin") && pw.equals("1234")) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}

	} // main

} // class
