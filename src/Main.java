import entities.*;
import interfaces.Jumper;
import interfaces.Runner;

public class Main {
	public static void main(String[] args) {
		// Animal a = new Animal("Piero", 20);
		//a.sayYourName();
		// System.out.println(a);

		Dog dog = new Dog("Rex", 2, true);
		// dog.sayYourName();
		//dog.sayYourName();
//


		Cat cat = new Cat("Felix", 3, true);
//		cat.sayYourName("CIAO A TUTTI");


		Student student = new Student("Aldo", "Baglio", true, StudentType.FULLSTACK); // è un RUNNER
		Dog ringhio = new Dog("Ringhio", 3, false); // è un RUNNER

		Runner[] runners = {student, ringhio};
		Jumper[] jumpers = {student, cat};
		Animal[] animals = {dog, cat, ringhio};

		for (int i = 0; i < animals.length; i++) {
			System.out.println("Valore i: " + i);
			animals[i].makeSound();

			// Se volessi utilizzare metodi specifici di un certo animale (cane o gatto)
			// devo come prima cosa verificare se l'animale corrente tra i suoi tipi ha Cat (o Dog)
			if (animals[i] instanceof Cat) {
				// Prima di utilizzare il metodo specifico di Cat devo convertire l'Animal in Cat
				Cat currentCat = (Cat) animals[i]; // Il CASTING ESPLICITO lo posso usare solo quando solo sicuro di poterlo fare
				// in questo caso abbiamo prima controllato con instanceof se stiamo usando un gatto
				currentCat.jump(10); // Qua posso usare un metodo specifico dei gatti e non dei cani
			} else {
				System.out.println(animals[i] + " non è un gatto");
			}
		}

		for (Runner runner : runners) {
			runner.run(10);
		}

		for (Jumper jumper : jumpers) {
			jumper.jump(20);
		}

		makeAnimalSound(ringhio);
		makeAnimalSound(cat);
	}

	public static void makeAnimalSound(Animal animal) { // Se il parametro lo dichiaro come Animal, sfrutto il polimorfismo, per passare
		// sia cani che gatti a questo metodo, rendendolo molto più flessibile
		animal.makeSound();
	}

//	public static void makeAnimalSound(Dog dog) { // Questo mi permette di passare SOLO ESCLUSIVAMENTE cani, quindi meno versatile
//		dog.makeSound();
//	}
}
