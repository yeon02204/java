package ch16;

public class Library {

//	Library클래스
//	필드
//	Book[] books : 책들을 담는 배열
//	int count : 현재 저당된 책의 수
//
//	생성자에서는 배열의 길이을 받아 배열을 생성, count는 0으로 초기화 하기
//
//	메서드
//	void addBook(String title, String author)
//	새로운 Book 객체를 만들어 배열에 추가한다.
//	"책 추가: 제목 - xx, 저자 - xxx" 출력하기
//	배열이 꽉 찼으면 "더 이상 책을 추가할 수 없습니다." 출력
//
//	void printAllBooks()
//	저장된 모든 책의 정보 출력하기
//
	Book[] books;
	int count;

	public Library(int n) {
		books = new Book[n];

	}

	public void addBook(String title, String author) {
		Book b = new Book(title, author);

		if (count >= books.length) {
			System.out.println("더 이상 책을 추가할 수 없습니다.");
			return;
		}
		books[count] = b;
		System.out.println("책 추가 : 제목 - " + title + ", 저자 - " + author);
		count++;
	}

	public void printAllBooks() {
		for (int i = 0; i < count; i++) {
			books[i].printInfo();
		}
	}

}// 클래스
