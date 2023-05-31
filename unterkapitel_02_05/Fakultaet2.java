package unterkapitel_02_05;

public class Fakultaet2 {

	/*
	 * 
	 * 
	 * 
	 * 1!= 1
	 * 
	 * 2!= 1 * 2
	 * 
	 * 3!= 1 * 2 * 3
	 * 
	 * 4!= 1 * 2 * 3 * 4
	 * 
	 */

	public static int berechneFakultaet(int x) {

		if (x <= 1) {

			return 1;

		} else {

			return x * berechneFakultaet(x - 1);

		}

	}

	public static void main(String args[]) {

		int x = 6;

		long y = 1;

		System.out.print("Die Fakultät von " + x + " (while) ");

		while (x >= 1) {

			y *= x;

			x--;

		}

		System.out.println(" ergibt " + y);

		x = 6;

		y = 1;

		System.out.print("Die Fakultät von " + x + " (for) ");

		for (int i = 1; i <= x; i++) {

			// for (int i=x; i >= 1; i-- ) {

			y *= i;

		}

		System.out.println(" ergibt " + y);

		x = 6;

		int f = berechneFakultaet(x);

		System.out.println("Die Fakultät von " + x + " (rekusiv) ist " + f);

	}

}
