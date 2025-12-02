package ex_system;

public class GetPropertyEzample {

	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		System.out.println(osName);
		
		String userName= System.getProperty("user.name");
		System.out.println(userName);
		
		String userHome= System.getProperty("user.home");
		System.out.println(userHome);
		
		// os별 파일 경로 다르게 처리
		// 특정 os 환경에서만기능 활성화
		// jvm버전을 체크
		// 파일 저장 위치를 사용자 환경에 따라 자동 설정

	}

}
