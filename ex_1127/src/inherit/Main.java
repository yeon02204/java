package inherit;

public class Main {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.name = "노루";
		animal.eat();
		animal.sleep();
		// animal.bark();

		Dog dog = new Dog();
		dog.name = "해피";

		dog.eat();
		dog.sleep();
		dog.bark();

		Bird bird = new Bird();
		bird.name = "오목눈이";
		bird.eat();
		bird.sleep();
		bird.fly();
		
		Child child= new Child(10);
		
		
	}

}
