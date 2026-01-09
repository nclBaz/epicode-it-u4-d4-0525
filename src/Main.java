import entities.Cat;
import entities.Dog;

public class Main {
	public static void main(String[] args) {
		// Animal a = new Animal("Piero", 20);
		//a.sayYourName();
		// System.out.println(a);

		Dog dog = new Dog("Rex", 2, true);
		dog.sayYourName();
		//dog.sayYourName();
//
		System.out.println(dog);

		Cat cat = new Cat("Felix", 3, true);
//		cat.sayYourName("CIAO A TUTTI");

		System.out.println(cat);

		dog.makeSound();
		cat.makeSound();

	}
}
