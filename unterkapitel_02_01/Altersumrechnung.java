package unterkapitel_02_01;

public class Altersumrechnung {

	public static void main(String[] args) {

		int alterInJahren;
		int alterInStunden;
		int alterInMinuten;
		String name;

		name = "Michael";
		alterInJahren = 35;
		alterInStunden = alterInJahren * 365 * 24;
		alterInMinuten = alterInStunden * 60;

		System.out.println("Hallo " + name + "! " );
		System.out.println(alterInJahren + " Jahre entsprechen " + alterInStunden + " Stunden.");
		System.out.println("Das sind "+ alterInMinuten + " Minuten");

	}

}
