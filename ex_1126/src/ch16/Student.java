package ch16;

public class Student {
	
//	Student클래스를 만들고 다음의 내용을 작성하세요
//	필드
//	String name;
//	int kor
//	int eng
//	int math
//
//	생성자를 통해서 필드를 초기화 한다.
//
//	메서드
//	int getTotal() : 총점을 반환한다.
//	double getAverage() : 평균을 소수 둘째 자리까지 반환한다.
//	char getGrade() : 평균에 따라 성적 등급을 반환한다.
//
//	StudentMain클래스에서
//	"홍길동",95,85,90 데이터를 갖는 객체를 생성하고
//	이름, 총점,평균,등급을 출력하세요
	
	String name;
	int kor;
	int eng;
	int math;
	
	public Student(String name,int kor,int eng, int math) {
		
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getTotal() {
		
		
		int total = kor + eng + math;
		return total;
	}
	
	
	public double getAverage() {
		
		return getTotal() / 3.0;
		
	}
	
	public char getGrade() {
		double avg = getAverage(); 
		if(avg < 0 || avg > 100) {
			System.out.println("평균을 잘못입력하셨습니다");
			return 'N';
		}else if(avg >= 90) {
			return 'A';		
		}else if(avg >= 80) {
			return 'B';		
		}else if(avg >= 70) {
			return 'C';		
		}else if(avg >= 60) {
			return 'D';		
		}else{
			return 'F';		
		}
			
	}
	
	
	
	
	
}
