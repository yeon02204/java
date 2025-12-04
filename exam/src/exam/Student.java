package exam;
// 1번문제
public class Student {

	String name;
	int age;
	String major;

	public Student() {

	}

	public void Student(String name, int age, String major) {
		this.name = name;
		this.age = age;
		this.major = major;
	}

	public void printInfo(String name, int age, String major) {
		System.out.println("이름 : " + name + ", 나이 : " + age + ", 전공 : " + major);
	}
}
