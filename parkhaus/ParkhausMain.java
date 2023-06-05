package parkhaus;

import java.util.Scanner;

public class ParkhausMain {

	static String[][] arr;

	public static void main(String[] args) {

		ParkhausErstellen();
		Auswahl();

	}

	static void ParkhausErstellen() {
		int anzahlEtagen;
		int anzahlParkplätze;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Anzahl Etagen eingeben.");

		anzahlEtagen = scanner.nextInt();

		scanner = new Scanner(System.in);

		System.out.println("Anzahl Parkplätze pro Etage eingeben.");

		anzahlParkplätze = scanner.nextInt();

		arr = new String[anzahlEtagen][anzahlParkplätze];

		System.out.println("Bestätigt. \nAnzahl Etagen: " + arr.length);
		System.out.println("Anzahl Parkplätze pro Etage: " + arr[0].length);

		arr[0][0] = "hallo";
		arr[0][0] = null;

	}

	static void Auswahl() {
		System.out.println();
		System.out.println("-----------------------------------------------------------------------");
		System.out.println();
		System.out.println("Was wollen Sie tun? Geben Sie bitte die Zahl ein.");
		System.out.println("(1)  Einfahrt Auto. ");
		System.out.println("(2)  Ausfahrt Auto. ");
		System.out.println("(3)  Nach Auto suchen. ");

		Scanner scannerMenu = new Scanner(System.in);
		int auswahl = scannerMenu.nextInt();

		if (auswahl == 1) {
			Einfahrt();
		}
		if (auswahl == 2) {
			Ausfahrt();
		}
		if (auswahl == 3) {
			AutoSuche();
		}

	}

	static void Einfahrt() {

		System.out.println("Nummernschild eingeben.");

		Scanner scanner2 = new Scanner(System.in);

		String auto = scanner2.next();
		boolean parkplatzGefunden = false;
		
	
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				if (arr[i][j] == null) {
					arr[i][j] = auto;
					System.out.println("Das Auto mit dem Nummernschild: " + auto + " wurde dem Parkplatz " + (j + 1)
							+ " auf Etage " + (i + 1) + " zugewiesen.");
					parkplatzGefunden = true;
					break;
				}

			}
			if (parkplatzGefunden) {
				parkplatzGefunden = false;
				break;
			}
		}

		Auswahl();

	}

	static void Ausfahrt() {

		boolean autoGefunden = false;
		System.out.println("Bitte geben Sie das Nummernschild des Autos ein, das ausfahren soll.");
		Scanner scannerAusfahrt = new Scanner(System.in);

		String autoAusfahrt = scannerAusfahrt.next();

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				if (arr[i][j] != null) {
					if (arr[i][j].equals(autoAusfahrt)) {
						arr[i][j] = null;
						System.out.println("Das Auto mit dem Nummernschild: " + autoAusfahrt
								+ " wurde aus dem Parkhaussystem entfernt.");
						autoGefunden = true;
						break;
					}
				}

			}
			if (autoGefunden) {
				break;

			}

		}
		if (!autoGefunden) {
			System.out.println("Das Auto mit dem Nummernschild " + autoAusfahrt + " befindet sich nicht im Parkhaus.");
		}

		Auswahl();

	}

	static void AutoSuche() {

		boolean autoGefunden = false;
		System.out.println("Bitte geben Sie das Nummernschild des Autos ein, das gesucht wird.");
		Scanner scannerSuche = new Scanner(System.in);

		String autoSuche = scannerSuche.next();

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] != null) {
					if (arr[i][j].equals(autoSuche)) {

						System.out.println("Das Auto mit dem Nummernschild: " + autoSuche + " steht auf dem Parkplatz "
								+ (j + 1) + " Auf der Etage " + (i + 1));
						autoGefunden = true;
						break;
					}
				}
			}
			if (autoGefunden) {
				break;
			}
			if (!autoGefunden) {
				System.out.println("Das Auto mit dem Nummernschild " + autoSuche + " befindet sich nicht im Parkhaus.");
			}
		}
			
		Auswahl();

	}

}
