package ch16;

public class LibraryMain {

	public static void main(String[] args) {
//		LibraryMain
//		크기가 3인 Library 객체를 만들고 책 3권을 추가한뒤 전체 책 정보 출력하기
		Book b = new Book("xx", "xxx");

		Library lib = new Library(3);

		lib.addBook("수학의 정석", "홍길동");
		lib.addBook("자바의 정석", "김자바");
		lib.addBook("맛있는 점심", "함태희");

		lib.addBook("넘치는 책", "아무개");

		lib.printAllBooks();

	}

}
