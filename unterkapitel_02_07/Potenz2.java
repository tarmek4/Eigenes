package unterkapitel_02_07;

public class Potenz2 {

	public static void main(String[] args) {

		int a = 5;
		int b = 3;

		System.out.print(potenz(a, b));
	}

	public static int potenz(int a, int b) {

		int i = 1;
		if (i <= b) {

			System.out.println("schleife");
			return a * potenz(a, b - 1);

		} else
			return 1;

	}

}
