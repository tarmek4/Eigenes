package unterkapitel_02_05;

public class DoWhileDemo1 {

	public static void main(String args[]) {

		int alter;

		do {
			System.out.print("Bitte geben Sie Ihr Alter ein: ");
			alter = leseInteger();
		} while (alter < 6 || alter > 99);

		System.out.println("Ihr Alter in Tagen: " + (alter * 365));
	}

	public static int leseInteger() {
		java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		try {
			return Integer.parseInt(br.readLine());
		} catch (Exception ex) {
			return 0;
		}
	}
}