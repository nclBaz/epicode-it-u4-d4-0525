import entities.Animal;
import entities.Cat;
import entities.Dog;

public class Main {
	public static void main(String[] args) {
		Animal a = new Animal("Piero", 20);
		//a.sayYourName();
		System.out.println(a);

		Dog dog = new Dog("Rex", 2, true);
		//dog.sayYourName();
//		dog.bark();
		System.out.println(dog);

		Cat cat = new Cat("Felix", 3, true);
//		cat.sayYourName("CIAO A TUTTI");
//		cat.meow();
		System.out.println(cat);

	}
}
