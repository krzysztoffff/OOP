package pierwsza_klasa; 

public class Cat {

	private String name;
	private Integer age;

	public String whoAmI() {

		return "jestem kotem miau!";

	}

	@Override
	public String toString() {

		return whoAmI();
	}
	
	public String whoIReallyAm() {
		return "Age " + this.age + " Name " + this.name;
	}

	public void setName(String name) { // setter
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getAge() {
		return this.age;
	}

	public Object giveThis() {
		return this;
	}

}
