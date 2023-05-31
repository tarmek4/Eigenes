package Eigenes;

public class test {

	public static void main(String[] args) {

		boolean teilnamesperre = false;
		double groesse = 130;
		int alter = 12;
		double gewicht = 45;

		if (alter >= 12 && alter <= 18 && !teilnamesperre && gewicht <= 75 && groesse >= 120) {
			System.out.print("Sie dürfen in der Klasse A teilnehmen");
		} else {
			System.out.print("Keine Teilnahme in Klasse A möglich");
		}

		
		
		int a = 66;
		int b = 70;
		int c = 87;
		System.out.print( (char) a);
		System.out.print( (char) b);
		System.out.print( (char) c);

	}

}
