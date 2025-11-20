package ch01;

public class DataType {

	public static void main(String[] args) {
		//오버플로우
		//언더플로우
		// 각 타입마다 담을 수 있는 범위
		byte b1 = -128;
		byte b2 = -30;
		byte b3 = 0;
		byte b4 = 30;
		// byte b5 = 128; 범위 벗어남
		System.out.println(b1);//-128
		System.out.println(b2);//-30
		System.out.println(b3);// 0
		System.out.println(b4);// 30
		
		
		// long
		// 값을 long 타입으로 만들고 싶으면 값 뒤에 L을 붙여라
		
		long l1 = 10000000000L;
		
		// 문자형
		// 하나의 문자를 저장하는 자료형
		// 메모리 크기 2byte
		// 기본값 : \u0000(유니코드 값 0, null 문자);
		
		char c;
		// System.out.print(c);
		
		// 유니코드
		// 각국의 언어를 코드로서 저장해놓는 인코딩 방식이다.
		// 자바에서 문자는 반드시 작은 따옴표에 작성해야 한다
		
		char c1 = 'A'; // 문자를 저장 할 수 있다
		System.out.println(c1);// A
		char c2 = 44032; // 유니코드를 직접 저장하는것이 가능하다 
		System.out.println(c2);// 가
		char c3 = 65; // 아스키 코드를 저장 할 수 도 있다.
		System.out.println(c3); //A
		
		float f1 = 0.1234567890123456789f;
		double d1 = 0.1234567890123456789;
		
		System.out.println(f1); // 0.12345679
		System.out.println(d1); // 0.12345678901234568
		
		
		boolean isOn = true;
		boolean isStudent = false;
		
		System.out.println("전등 상태 :" + isOn); // 전등 상태 :true
		System.out.println("학생입니까? :" + isStudent); // 학생입니까? :false
		
		// 2. 참조 자료형 
		// 문자열 타입
		// 큰 따옴표 안에 감싸진 1글자 이상의 문자들
		
		String str1 = "A"; 
		String str2 = "홍길동"; 
		
		System.out.println(str1);// A
		System.out.println(str2);// 홍길동
		
		// 이스케이프 문자
		// 문자열 내부에서 특수한 기능을 가진 문자
		// \" : "(쌍따옴표) 를 문자열에서 쓸 수 있게  해주는 문자
		// \' 
		// \\
		// \n : 줄바꿈
		
		String str3 = "나는 \"자바\"를 배웁니다.";
		System.out.println(str3); // 나는 "자바"를 배웁니다.
		
		System.out.println("나는\n");
		System.out.println("자바를\n");
		System.out.println("배웁니다\n"); // 줄바꿈된 문장
		
		// java13 버전 이후로는 텍스트 블록 문법도 제공
		String str4 = """
				여기에 
				문자열을 
				작성합니다.
				""";
		System.out.println(str4); // 텍스트 블록으로 만들오어진 문장 (줄바꿈 적용)
		
		
		
		
		
		
		
		

	}

}
