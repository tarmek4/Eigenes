package unterkapitel_03_01;

public class ReferenzDemo {

	public static void main(String args[]) {
		Auto a = new Auto();
		a.marke = "BMW";

		Auto b = a;

		b.marke = "Porsche";

		System.out.println(a.marke);
	}
}