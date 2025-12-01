package inner_class;

public class Main {

	public static void main(String[] args) {
		Outer outer = new Outer();

		// 내부 클래스의 객체 만들기
		Outer.Inner inner = outer.new Inner();

		inner.print();
		// 실무에서 크게 많이 쓰이지는 않는다

		// User user = new User.Build();

		RemoteControl rc = new RemoteControl() {

			@Override
			public void trunOn() {
				System.out.println("TV를 켭니다");

			};

			@Override
			public void TrunOff() {
				System.out.println("TV를 끕니다");

			};
		};

		rc.trunOn();
		rc.TrunOff();

		Calculator c1 = new Calculator() {

			@Override
			public int calc(int x) {
				return x * x;
			};
		};
		System.out.println(c1.calc(5));

		Button btn = new Button();
		btn.setOnclickListener(new Button.OnclickListener() {
			@Override
			public void onClick() {
				System.out.println("버튼 클릭");
			};
		});
		// btn.click();
		
	}
}
