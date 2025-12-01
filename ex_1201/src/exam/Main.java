package exam;

public class Main {
	public static void main(String[] args) {

		NotificationService ns = new NotificationService();

		EmailSender es = new EmailSender();
		SmsSender ss = new SmsSender();

		ns.notifyUser(es, "회원가입을 축하합니다");
		ns.notifyUser(ss, "인증번호는 1234입니다");

		PayService ps = new PayService();
		CardPayment cp = new CardPayment();
		KakaoPayPayment kakao = new KakaoPayPayment();
		
		ps.processPayment(kakao, 10000);
		ps.processPayment(cp, 20000);

	}
}
