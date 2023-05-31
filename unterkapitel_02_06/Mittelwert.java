package unterkapitel_02_06;

public class Mittelwert {

	public static void main(String[] args) {

		for (int j = 0; j < 10; j++) {

			int min = 9;
			int max = 10;

			final int groesse = 100000;
			int werte[] = new int[groesse];

			for (int i = 0; i < groesse; i++) {

				werte[i] = (int) (Math.random() * (max - min + 1) + min);

				// werte[i] = (int) (Math.random() * (50 + 1)); // für 1 bis 50
			}

			double summe = 0;

			for (int wert : werte) {

				summe += wert;
			}

			System.out.println(summe / groesse);
		}
	}

}
