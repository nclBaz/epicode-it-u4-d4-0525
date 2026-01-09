package entities;

public abstract class Animal {
	// La classe Animal sarà la nostra SUPERCLASSE
	// Qua aggiungeremo tutte le caratteristiche comuni a tutti gli animali
	// I figli erediteranno queste caratteristiche e poi potranno definirne di ulteriori specifiche del tipo di animale
	private String name;
	private int age;

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void sayYourName() {
		System.out.println("Ciao sono un animale e mi chiamo " + this.name + ", la mia età è: " + this.age);
	}

	public abstract void makeSound();

	@Override
	public String toString() {
		return "Animal{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
