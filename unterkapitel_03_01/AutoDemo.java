package unterkapitel_03_01;

public class AutoDemo {
	public static void main(String[] args) {
		Auto meins, deins;
		meins = new Auto();
		deins = new Auto();

		meins.marke = "BMW";
		deins.marke = "Toyota";
		meins.tempo = 0;
		deins.tempo = 0;
		meins.ps = 120;
		deins.ps = 140;
		meins.farbe = "rot";
		deins.farbe = "blau";
		meins.beschleunige();

		System.out.print("Meine Marke: " + meins.marke);
		System.out.print(", Meine Leistung: "+ meins.ps);
		System.out.print(", Meine Farbe: "+ meins.farbe);
		System.out.println(", Meine Geschw.: " + meins.tempo);
		

		System.out.print("Deine Marke: " + deins.marke);
		System.out.print(", Deine Leistung: "+ deins.ps);
		System.out.print(", Deine Farbe: "+ deins.farbe);
		System.out.println(", Deine Geschw.: " + deins.tempo);
	}
}