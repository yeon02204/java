package inherit;

// 부모 클래스
public class Pan {
	protected int amount;
	protected String color;

	public Pan() {
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}

// 샤프펜
class SharpPencil extends Pan {
	private int width; // 샤프 굵기

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
}

// 볼펜
class Ballpen extends Pan {
	// Pan이 amount / color 다 가지고 있음 → 중복 선언 X

}

// 만년필
class FountainPen extends Ballpen {
	public void refill(int n) {
		setAmount(n); // 부모한테 있는 amount 그대로 사용
	}
}
