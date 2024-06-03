package spiel;

import java.util.Scanner;

public class spielHaupt {

	static int gesundheit_spieler = 20;

	public static int schaden_spieler() {

		int schaden_spieler;

		if (staerketrank_benutzt) {
			schaden_spieler = (int) (Math.random() * 8 + 3);
		} else {
			schaden_spieler = (int) (Math.random() * 8 + 1);
		}

		return schaden_spieler;

	}

	static int gesundheit_spieler_max = gesundheit_spieler;

	static int heiltrank = 0;
	static int staerketrank = 1;
	static boolean staerketrank_benutzt = false;

	static String aktueller_raum = " ";

	public static void inventar() {

		System.out.println("Inventar:");
		System.out.println("Was willst du benutzen?");
		if (heiltrank > 0) {
			System.out.println("(1)  " + heiltrank + " mal Heiltrank. Heilt 5 Gesundheit.");
		}
		if (staerketrank > 0) {
			System.out.println("(2)  " + staerketrank + " mal Stärketrank. + 2 Schaden für den nächsten Kampf.");
		}

		System.out.println("(4)  Zurück.");

		Scanner scanner = new Scanner(System.in);
		int auswahl_inventar = 0;

		while (true) {
			if (scanner.hasNextInt()) {
				auswahl_inventar = scanner.nextInt();
			}
			if (auswahl_inventar == 1 && heiltrank > 0) {
				gesundheit_spieler += 5;
				if (gesundheit_spieler > gesundheit_spieler_max) {
					gesundheit_spieler = gesundheit_spieler_max;
				}
				System.out.println("Du trinkst einen Heiltrank und heilst dich um 5. Deine neue Gesundheit ist "
						+ gesundheit_spieler);
				heiltrank--;
				zurueck();
				break;
			}

			if (auswahl_inventar == 2 && staerketrank > 0) {
				System.out.println("Du trinkst einen Stärketrank. Du fügst im nächsten Kampf +2 Schaden mit jedem Schlag zu.");
				staerketrank_benutzt = true;
				staerketrank--;
				zurueck();
				break;
			}

			if (auswahl_inventar == 4) {
				zurueck();
				break;
			}

		}
	}

	public static void zurueck() {
		if (aktueller_raum.equals("haupttor")) {
			main(null);
		}
		if (aktueller_raum.equals("zombieraum")) {
			zombieraum();
		}
		if (aktueller_raum.equals("raum_mit_goldtor")) {
			raum_mit_goldtor();
		}
		if (aktueller_raum.equals("ogerraum")) {
			ogerraum();
		}
		if (aktueller_raum.equals("sprechende_tuer")) {
			sprechende_tuer();
		}
	}

	public static void main(String[] args) {

		aktueller_raum = "haupttor";

		System.out.println("Du stehst vor einem Tor in einer Felswand.");
		System.out.println("Was willst du tun?");
		System.out.println("(1) Anklopfen");
		System.out.println("(2) Öffnen");
		System.out.println("(3) Inventar ansehen");

		while (true) {

			Scanner scanner = new Scanner(System.in);

			int auswahl_eingangstor = 0;

			if (scanner.hasNextInt()) {
				auswahl_eingangstor = scanner.nextInt();
			}

			if (auswahl_eingangstor == 1) {
				System.out.println("Du klopfst an...Es scheint keiner da zu sein.\n");
				System.out.println("Was willst du tun?");
				System.out.println("(1) Anklopfen");
				System.out.println("(2) Öffnen");
				System.out.println("(3) Inventar ansehen");
			}

			if (auswahl_eingangstor == 2) {
				System.out.println("Du öffnest das Tor. Dahinter befindet sich ein Gang. "
						+ "Ein paar Meter weiter ist ein Raum mit einem Zombie.\n");
				Scanner userInput = new Scanner(System.in);
				userInput.nextLine();
				zombieraum();
				break;
			}

			if (auswahl_eingangstor == 3) {
				inventar();
				break;

			}

		}

	}

	public static void zombieraum() {
		aktueller_raum = "zombieraum";

		System.out.println("Der Zombie sieht nicht aus, als würde er dich ohne Kampf vorbeilassen. "
				+ "Außerdem riecht er ziemlich schlecht.\n");
		System.out.println("Was willst du tun?");
		System.out.println("(1) Angriff!");
		System.out.println("(2) Versuch zu verhandeln.");
		System.out.println("(3) Inventar ansehen");

		while (true) {
			Scanner scanner = new Scanner(System.in);
			int auswahl_zombieraum = 0;

			if (scanner.hasNextInt()) {
				auswahl_zombieraum = scanner.nextInt();
			}

			if (auswahl_zombieraum == 1) {
				zombiekampf();
				break;
			}
			if (auswahl_zombieraum == 2) {
				System.out.println(
						"Der Zombie gibt unverständliche Laute von sich. Diplomatie scheint hier fehl am Platz.\n");
				System.out.println("Was willst du tun?");
				System.out.println("(1) Angriff!");
				System.out.println("(2) Versuch zu verhandeln");
				System.out.println("(3) Inventar ansehen");
			}
			if (auswahl_zombieraum == 3) {
				inventar();
				break;
			}
		}
	}

	public static void zombiekampf() {

		Scanner userInput = new Scanner(System.in);

		int gesundheit_zombie = 10;

		System.out.println("Du ziehst dein Schwert und greifst den Zombie an. Er wehrt sich.");
		System.out.println("Deine Gesundheit ist (" + gesundheit_spieler + ")");
		System.out.println("Die Gesundheit des Zombies ist (" + gesundheit_zombie + ")");
		userInput.nextLine();

		while (gesundheit_spieler > 0 && gesundheit_zombie > 0) {

			int schaden_zombie = (int) (Math.random() * 4 + 1);
			int schaden_spieler = schaden_spieler();

			System.out.println(
					"Du schlägst mit dem Schwert zu und fügst dem Zombie (" + schaden_spieler + ") Schaden zu.");
			gesundheit_zombie -= schaden_spieler;
			System.out.println("Die Gesundheit des Zombies ist (" + gesundheit_zombie + ")");

			if (gesundheit_zombie > 0) {
				System.out.println("Der Zombie boxt dich und fügt dir (" + schaden_zombie + ") Schaden zu.");
				gesundheit_spieler -= schaden_zombie;
				System.out.println("Deine Gesundheit ist (" + gesundheit_spieler + ")");
			}
			userInput.nextLine();

		}

		if (gesundheit_spieler <= 0) {
			System.out.println("Du bist tot! Tja, kann man nix machen.");
		}
		if (gesundheit_spieler > 0 && gesundheit_zombie <= 0) {
			System.out.println("Du hast den Zombie besiegt.");

			if (staerketrank_benutzt) {
				System.out.println("Der Stärketrank hört auf zu wirken.");
				staerketrank_benutzt = false;
			}

			System.out.println("Du durchsuchst den Raum und findest einen Heiltrank.");
			heiltrank++;
			userInput.nextLine();
			System.out.println(
					"Nachdem du dir den Weg freigekämpft hast, gehst du durch den Gang, der weiter in den Berg führt.\n"
							+ "Nach ein paar Treppenstufen nach unten, kommst du in einen großen Raum, der durch Fackeln erleuchtet ist. \n"
							+ "Auf der anderen Seite siehst du eine großes goldenes Tür mit der Aufschift \"Schatzkammer\". \n"
							+ "Jeweils rechts und links geht ein weiterer Gang ab.\n");
			raum_mit_goldtor();
		}

	}

	public static void raum_mit_goldtor() {
		aktueller_raum = "raum_mit_goldtor";

		while (true) {

			System.out.println("Was willst du tun?");
			System.out.println("(1) Die Tür öffnen.");
			System.out.println("(2) Den rechten Gang entlang gehen.");
			System.out.println("(3) Den linken Gang entlang gehen.");
			System.out.println("(4) Inventar ansehen.");

			Scanner scanner = new Scanner(System.in);
			int auswahl_raum_mit_goldtor = 0;

			if (scanner.hasNextInt()) {
				auswahl_raum_mit_goldtor = scanner.nextInt();
			}

			if (auswahl_raum_mit_goldtor == 1) {
				System.out.println(
						"Du rüttelst an der Tür, aber sie öffnet sich nicht.\n" + "Auch Anklopfen führt zu nichts.\n"
								+ "Rechts und links der Tür siehst du jeweils ein Schlüsselloch.\n");
			}
			if (auswahl_raum_mit_goldtor == 2) {
				System.out.println("Du gehst in den rechten Gang.");
				ogerraum();
				break;
			}
			if (auswahl_raum_mit_goldtor == 3) {
				System.out.println("Du gehst in den linken Gang.\n"
						+ "Nach ein paar Metern kommst du an eine verschlossene Tür.\n");
				sprechende_tuer();
				break;
			}
			if (auswahl_raum_mit_goldtor == 4) {
				inventar();
				break;

			}

		}

	}

	public static void ogerraum() {
		aktueller_raum = "ogerraum";

		System.out.println("Nach ein paar Metern kommst du in einen Raum, in dem ein Oger an einem Feuer sitzt.\n"
				+ "Er ist im Stehen sicher 4 Meter groß, hat Arme wie Baumstämme und sieht dich bedrohlich an.\n"
				+ "An seinem Hals hängt eine Kette mit einem Schlüssel.\n");

		System.out.println("Was willst du tun?");
		System.out.println("(1) Angriff!");
		System.out.println("(2) Versuch mit dem Oger zu reden.");
		System.out.println("(3) Schnell wieder abhauen. Der Oger sieht ziemlich stark aus.");
		System.out.println("(4) Inventar ansehen.");

		while (true) {
			Scanner scanner = new Scanner(System.in);
			int auswahl_ogerraum = 0;

			if (scanner.hasNextInt()) {
				auswahl_ogerraum = scanner.nextInt();
			}

			if (auswahl_ogerraum == 1) {
				Scanner userInput = new Scanner(System.in);

				int gesundheit_oger = 50;

				System.out.println("Du ziehst dein Schwert und greifst den Oger an. Er wehrt sich.");
				System.out.println("Deine Gesundheit ist (" + gesundheit_spieler + ")");
				System.out.println("Die Gesundheit des Ogers ist (" + gesundheit_oger + ")");
				userInput.nextLine();

				while (gesundheit_spieler > 0 && gesundheit_oger > 0) {

					int schaden_spieler = schaden_spieler();
					int schaden_oger = (int) (Math.random() * 20 + 1);

					System.out.println(
							"Du schlägst mit dem Schwert zu und fügst dem Oger (" + schaden_spieler + ") Schaden zu.");
					gesundheit_oger -= schaden_spieler;
					System.out.println("Die Gesundheit des Ogers ist (" + gesundheit_oger + ")");
					System.out.println(
							"Der Oger gibt dir ne böse Schelle und fügt dir (" + schaden_oger + ") Schaden zu.");
					gesundheit_spieler -= schaden_oger;
					System.out.println("Deine Gesundheit ist (" + gesundheit_spieler + ")");
					userInput.nextLine();
				}

				if (gesundheit_spieler <= 0) {
					System.out.println("Du bist Muß. War wohl ne schlechte Idee sich mit dem Oger anzulegen.");
					break;
				}
			}

			if (auswahl_ogerraum == 2) {
				System.out.println("Bevor du ein Wort rausbringst brüllt der Oger: \n"
						+ "Noch son kleiner Mann! Immer wollt ihr kloppen! Keiner nett zu Bonk! Komm nur her! Bonk kloppt dich! Kriegst Bonks Schlüssel nicht!\n");
				System.out.println("Was willst du tun?");
				System.out.println("(1) Angriff!");
				System.out.println("(2) Versuch mit dem Oger zu reden.");
				System.out.println("(3) Schnell wieder abhauen. Der Oger sieht ziemlich stark aus.");
				System.out.println("(4) Inventar ansehen.");

			}
			if (auswahl_ogerraum == 3) {
				System.out.println(
						"Du nimmst die Beine in die Hand und läufst zurück in den Raum mit der goldenen Tür.\n");
				raum_mit_goldtor();
				break;
			}
			if (auswahl_ogerraum == 4) {
				inventar();
				break;
			}
		}
	}

	public static void sprechende_tuer() {
		aktueller_raum = "sprechende_tuer";
		System.out.println("Was willst du tun?");
		System.out.println("(1) Anklopfen");
		System.out.println("(2) Öffnen");
		System.out.println("(3) Inventar ansehen");

		while (true) {

			Scanner scanner1 = new Scanner(System.in);
			int auswahl_sprechende_tuer = 0;

			if (scanner1.hasNextInt()) {
				auswahl_sprechende_tuer = scanner1.nextInt();
			}

			if (auswahl_sprechende_tuer == 1) {
				antwort_wer_ist_da();
				break;

			}
			if (auswahl_sprechende_tuer == 2) {
				System.out.println(" Verschlossen.\n");

			}
			if (auswahl_sprechende_tuer == 3) {
				inventar();
			}

		}

	}

	public static void antwort_wer_ist_da() {

		System.out.println("Du kloppfst an die Tür. Auf der anderen Seite hörst du eine Stimme\n"
				+ "\"Wer ist da? Bist du dieser dicke Oger?\"\n");
		System.out.println("(1) Ähm...Ja klar. Und ich bin garnicht dick!");
		System.out.println("(2) Nein. Ich bin ein Abenteurer und will eure Schatzkammer plündern.");

		Scanner scanner2 = new Scanner(System.in);
		int auswahl_wer_ist_da = 0;

		if (scanner2.hasNextInt()) {
			auswahl_wer_ist_da = scanner2.nextInt();
		}
		if (auswahl_wer_ist_da == 1) {
			System.out.println(
					"Deine Stimme klingt aber komisch. Sag mir zur Sicherheit mal deinen Namen, damit ich weiß, dass du es auch wirklich bist.");
			scanner2.nextLine(); // leert den scanner, damit scanner3 funktioniert
			antwort_oger_name();

		}

		if (auswahl_wer_ist_da == 2) {
			System.out.println("Der Chef meint, Abenteurern darf ich die Tür nicht aufmachen!");
			sprechende_tuer();
		}

	}

	public static void antwort_oger_name() {
		Scanner scanner3 = new Scanner(System.in);
		String name_oger = "";

		if (scanner3.hasNext()) {
			name_oger = scanner3.next();
		}

		if (name_oger.equals("Bonk") || name_oger.equals("bonk")) {

			System.out.println("\"Ach na dann. Komm rein Bonk.\"");
			scanner3.close();
			// Methode einfügen.

		} else {
			System.out.println("\"Das stimmt nicht. Hau ab!\"");

		}
	}

	public static void goblinraum() {
		System.out.print("Die Tür öffnet sich und du stehst einem überraschten Goblin gegenüber. \n ");

	}
}
