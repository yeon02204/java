package ch16;

public class StudentMain {

	public static void main(String[] args) {
		// 
		
		Student st = new Student("홍길동",95,85,90);
		
		System.out.println(st.name);
		System.out.println(st.getTotal());
		System.out.println(st.getAverage());
		System.out.println(st.getGrade());
		
		
		
	}

}
