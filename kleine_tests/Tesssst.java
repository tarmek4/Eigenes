package kleine_tests;

public class Tesssst {

	public static void main(String[] args) {
		System.out.println(schaden_spieler());

	}
	
	public static int schaden_spieler() {

		int schaden_spieler;

			schaden_spieler = (int) (Math.random() * 8 + 1);


		return schaden_spieler;

	}

}
