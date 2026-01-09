package entities;

public class Cat extends Animal {
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

	public void sayYourName(String saluto) { // OVERLOAD del metodo precedente
		this.sayYourName();
		System.out.println(saluto);
	}

	public void meow() {
		System.out.println("MEOW!");
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
}
