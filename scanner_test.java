import java.util.Scanner;

public class scanner_test {

	public static void main(String[] args) {

		while (true) {
			Scanner scanner = new Scanner(System.in);
			if (scanner.hasNextDouble()) {
				double zahl = scanner.nextDouble();
				System.out.println(zahl * zahl);
			} else {
				System.out.println("Zahl, du Hannes!");
			}
		}
	}

}
