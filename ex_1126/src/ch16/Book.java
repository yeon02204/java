package ch16;

public class Book {

//	Book 클래스
//	필드
//	- String title
//	- String author
//
//	필드는 생성자를 통해 초기화한다.
//
//	메서드
//	void printInfo() : "제목 : xx, 저자 : xxx"형태로 출력
//
	String title;
	String author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;

	}

	public void printInfo() {
		System.out.println("제목 : " + title + ", 저자 : " + author);
	}

}// 클래스
