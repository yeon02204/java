package lombok;

public class Main {
	public static void main(String[] args) {
		Member m = new Member();
		m.setId(100L);
		m.setName("홍길동");
		m.setEmail("이메일");
		
		Member m2 = new Member().builder()
				.id(100L)
				.name("박길동")
				.email("이메일")
				.build();
		
		Student student = new Student().builder()
				.name("김말똥")
				.age(23)
				.phone("010-1111-1111")
				.email("asdasd@nasdsd.com")
				.address("부천시")
				.build();
		
	}
}
