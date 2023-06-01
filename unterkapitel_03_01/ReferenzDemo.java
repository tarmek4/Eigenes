package unterkapitel_03_01;

public class ReferenzDemo {

	public static void main(String args[]) {
		Auto a = new Auto();
		a.setMarke("BMW");

		Auto b = a;

		b.setMarke("Porsche");

		System.out.println(a.getMarke());
	}
}