package lombok;

@Getter @Setter // 모든 필드에 getter, setter만들어줌
@NoArgsConstructor // 기본생성자
@AllArgsConstructor // 모든 필드를 매개변수로 갖는 생성자
@RequiredArgsConstructor // @NonNall,final로 지정된 필드만 매개변수로 갖는다
@Data // Getter,Setter,RequiredArgsConstructor 를 한번에 지정해주는 어노테이션
@Builder

public class Member {

	@NonNull
	private Long id;
	
	private String name;
	private String email;

//	private Member() {
//
//	}
//
//	public Member(Long id, String name, String email) {
//		this.id = id;
//		this.name = name;
//		this.email = email;
//	}
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}

	

}
