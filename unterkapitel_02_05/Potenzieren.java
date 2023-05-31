package unterkapitel_02_05;

public class Potenzieren {

	public static void main(String[] args) {
		int basis = 2;
		int exponent = 2;
		int ergebnis = 1;
		int zaehler = exponent;
		
		while (zaehler > 0) {
			ergebnis *= basis;
			zaehler--;
		}
		System.out.print(basis+ " hoch "+ exponent + " ist "+ ergebnis);
	}
}
