package ex_object;

// 자바의 최상위 클래스는 object이다
// 모든클래스는 object를 상속받고 있다
public class Member {

	public String id;
	public Member(String id) {
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {
		// obj 가 membe타입인지 검사하고 타입 변환 후 taget변수에 대입
		if(obj instanceof Member target) {
			if (id.equals(target.id)) {// id 문자열이 같은지 비교
				return true;	
			}
		} return false;
	}
	
	
}
