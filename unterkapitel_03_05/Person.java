package unterkapitel_03_05;

public class Person {

	private String name;

	public void setName(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	public void introduceYourself() {
		System.out.println("Hallo! Mein Name ist " + getName() + "!");
	}
}