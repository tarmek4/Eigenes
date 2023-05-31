
package unterkapitel_02_07;

public class ZahlenRaten3 {

	public static void main(String args[]) {
		do {
			game();
		} while (playAgain());
		System.out.println("Auf wiedersehen!");
	}

	public static void game() {
		int numberOfGuesses, numberToGuess, usersGuess;
		boolean guessedRightNumber;
		System.out.println("Zahlenratespiel");
		System.out.println("---------------");

		numberOfGuesses = 0;
		numberToGuess = getRandomNumber(1, 100);
		do {
			numberOfGuesses++;
			usersGuess = getPlayersGuess();
			guessedRightNumber = evaluateGuess(usersGuess, numberToGuess);
		} while (!guessedRightNumber);

		System.out.print("Richtig! Die zu ratende Zahl war " + usersGuess);
		System.out.println(". Sie benötigten " + numberOfGuesses + " Versuche!");
	}

	public static boolean playAgain() {
		System.out.print("Geben Sie 1 ein, wenn Sie nochmal ");
		System.out.print("spielen möchten!");
		return readInt() == 1;
	}

	public static boolean evaluateGuess(int guess, int numberToGuess) {
		if (numberToGuess < guess) {
			System.out.println("Meine Zahl ist kleiner!");
			return false;
		} else if (numberToGuess > guess) {
			System.out.println("Meine Zahl ist größer!");
			return false;
		} else
			return true;
	}

	public static int getPlayersGuess() {
		int tipp;
		do {
			System.out.print("Ihr Tipp: ");
			tipp = readInt();
			if (tipp < 1 || tipp > 100) {
				System.out.println("Tipp nicht gewertet!");
				System.out.println("Geben Sie eine Zahl zwischen 1 und 100 ein!");
			}
		} while (tipp < 1 || tipp > 100);
		return tipp;
	}

	public static int getRandomNumber(int min, int max) {
		int bereich = max - min + 1;
		double zufall = bereich * Math.random();
		int ergebnis = (int) (zufall) + min;
		return ergebnis;
	}

	public static int readInt() {
		java.io.BufferedReader br;
		br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		try {
			return Integer.parseInt(br.readLine());
		} catch (Exception ex) {
			return 0;
		}
	}
}