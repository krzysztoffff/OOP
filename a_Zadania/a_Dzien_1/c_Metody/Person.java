package a_Zadania.a_Dzien_1.c_Metody;

public class Person {

	private String name = "John";
	private String surname = "Doe";
	private int age = 30;
	private String gender = "male";
	private String fullName = "fullname";

	public String getFullName() {
		this.fullName = name + "-" + surname;
		return this.fullName;

	}

	public int increaseAge(int age) {
		this.age = age + 1;
		return this.age;
	}

	public String setFullName(String fullName) {
		return this.fullName = fullName;
	}

	public String getName() {
		return this.name;

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
