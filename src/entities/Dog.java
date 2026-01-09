package entities;

import interfaces.Runner;

public class Dog extends Animal implements Runner {
	// Lista attributi ESCLUSIVA DEI DOG
	private boolean isACop;

	// Lista costruttori
	public Dog(String name, int age) { // Costruttore I
		super(name, age);
		this.isACop = false;
	}

	public Dog(String name, int age, boolean isACop) { // OVERLOAD DI COSTRUTTORE
		this(name, age); // Richiamo il costruttore I (Cross-Calling)
		this.isACop = isACop;
	}

	@Override
	public void sayYourName() {
		System.out.println("Ciao sono un CANE e mi chiamo " + this.getName() + ", la mia età è: " + this.getAge());
	}

	@Override
	public void makeSound() {
		System.out.println("BARK!");
	}


	public boolean isACop() {
		return isACop;
	}

	public void setACop(boolean ACop) {
		isACop = ACop;
	}

	@Override
	public String toString() {
		return "Dog{" +
				"name=" + this.getName() +
				", age=" + this.getAge() +
				", isACop=" + isACop +
				"} ";
	}

	@Override
	public void run(double km) {
		System.out.println("Ciao sono un cane e corro " + km + " km");
	}
}
