package unterkapitel_02_07;

public class ParametrisierteMethoden3 {

	public static void main(String[] args) {

		printRepeated("Methoden mit Parametern - gar nicht schwer!", 10);

	}

	public static void printRepeated(String text, int anzahl) {

		for (int i = 0; i < anzahl; i++) {
			System.out.println(text);
		}
	}
}
