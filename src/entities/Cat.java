package entities;

import interfaces.Jumper;

public class Cat extends Animal implements Jumper {
	// Lista attributi ESCLUSIVA DEI CAT
	private boolean hasBoots;

	public Cat(String name, int age, boolean hasBoots) {
		super(name, age); // utilizzo il costruttore del padre
		this.hasBoots = hasBoots;
	}

	@Override
	public void sayYourName() {
		super.sayYourName();
		System.out.println("Per essere più precisi sono un GATTO");
	}

	@Override
	public void makeSound() {
		System.out.println("MEOW!");
	}

	public void sayYourName(String saluto) { // OVERLOAD del metodo precedente
		this.sayYourName();
		System.out.println(saluto);
	}

	public boolean isHasBoots() {
		return hasBoots;
	}

	public void setHasBoots(boolean hasBoots) {
		this.hasBoots = hasBoots;
	}

	@Override
	public String toString() {
		return "Cat{" +
				"name=" + this.getName() +
				", age=" + this.getAge() +
				", hasBoots=" + hasBoots +
				"} ";
	}

	@Override
	public void jump(int cm) {
		System.out.println("Ciao sono un gatto e salto " + cm + " cm");
	}
}
