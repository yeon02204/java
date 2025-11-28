package exam1;

public class Main {

	public static void main(String[] args) {
		Animal zoo[] = {new Animal(),new Dog(),new Cat()};
		
		for(Animal a : zoo) {
			a.sound();
		}
		
		AnimalTraniner at = new AnimalTraniner();
		at.train(zoo[1]);
		at.train(zoo[2]);
		
	}

}
