package exam;


public class EmailSender implements MessageSender{

	@Override
	public void sned(String msg) {
		System.out.println("이메일 발송 : "+ msg);
		
	}

}
