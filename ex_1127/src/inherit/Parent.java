package inherit;

public class Parent {
	int p;
	
	public void parentMethod() {
		System.out.println("부모 메서드");
	}
	
	public Parent(int p) {
		this.p = p;
	}
}
