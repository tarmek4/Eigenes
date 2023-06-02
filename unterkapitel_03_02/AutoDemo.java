package unterkapitel_03_02;

public class AutoDemo {

	public static void main(String[] args) {
		Auto a = new Auto();
		System.out.println("Marke des neuen Autos: " + a.marke);

		Auto b = new Auto("VW", 120, 80);

		System.out.println("Marke: " + b.marke);
		System.out.println("PS: " + b.ps);
		System.out.println("Tempo: " + b.tempo);
	}
}