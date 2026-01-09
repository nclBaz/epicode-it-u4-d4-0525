package entities;

import interfaces.Jumper;
import interfaces.Runner;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Student implements Runner, Jumper {
	// Attributi statici
	private static int numStudentiCreati = 0;
	// Attributi di istanza
	private final int id;
	private String name;
	private String surname;
	private boolean isFullTime;
	private StudentType studentType;
	private double[] voti;

	// Costruttori
	public Student(String name, String surname, boolean isFullTime, StudentType studentType) {
		this.name = name;
		this.surname = surname;
		this.isFullTime = isFullTime;
		this.studentType = studentType;
		Random rndm = new Random();
		this.id = rndm.nextInt(1, 10000);
		numStudentiCreati++;
	}

	// Metodi statici
	// GETTER STATICI
	public static int getNumStudentiCreati() {
		return numStudentiCreati;
	}


	// Metodi di istanza
	// GETTER & SETTER DI ISTANZA
	// NON SONO COSTRETTO AD AVERE TUTTI I GETTER E TUTTI I SETTER PER TUTTI GLI ATTRIBUTI
	// Sono io che scelgo

//	public int getId() { // Ad esempio se non volessi il getter sull'id lo tolgo
//		return id;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() < 2) System.out.println("Nome troppo corto!");
			// Un altro vantaggio dei setter è quello di poter eseguire tutta la
			// logica di cui abbiamo bisogno, quindi a differenza dell'accesso
			// DIRETTO, possiamo ad esempio effettuare dei controlli prima di
			// sovrascrivere un valore
		else this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public boolean isFullTime() {
		return isFullTime;
	}

	public void setFullTime(boolean fullTime) {
		isFullTime = fullTime;
	}

	public StudentType getStudentType() {
		return studentType;
	}

	public void setStudentType(StudentType studentType) {
		this.studentType = studentType;
	}


	// Per farlo generare automaticamente ad intelliJ
	// Tasto dx -> generate -> toString()

	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", isFullTime=" + isFullTime +
				", studentType=" + studentType +
				", voti=" + Arrays.toString(voti) +
				'}';
	}


	// Per farlo generare automaticamente ad intelliJ
	// Tasto dx -> generate -> equals() and hashCode() (quest'ultimo però non ci serve)

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		Student student = (Student) o;
		return id == student.id &&
				isFullTime == student.isFullTime &&
				Objects.equals(name, student.name) &&
				Objects.equals(surname, student.surname) &&
				studentType == student.studentType;
	}

	@Override
	public void jump(int cm) {
		System.out.println("Salto gli esami");
	}

	@Override
	public void run(double km) {
		System.out.println("Scappo dagli esami");

	}
}
