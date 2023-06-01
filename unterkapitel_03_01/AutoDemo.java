package unterkapitel_03_01;

public class AutoDemo {
	public static void main(String[] args) {
		Auto meins, deins;
		meins = new Auto();
		deins = new Auto();

		meins.setMarke("BMW");
		deins.setMarke("Toyota");
		meins.setTempo(0);
		deins.setTempo(0);
		meins.ps = 120;
		deins.ps = 140;
		meins.farbe = "rot";
		deins.farbe = "blau";
		meins.beschleunige();

		System.out.print("Meine Marke: " + meins.getMarke());
		System.out.print(", Meine Leistung: "+ meins.ps);
		System.out.print(", Meine Farbe: "+ meins.farbe);
		System.out.println(", Meine Geschw.: " + meins.getTempo());
		

		System.out.print("Deine Marke: " + deins.getMarke());
		System.out.print(", Deine Leistung: "+ deins.ps);
		System.out.print(", Deine Farbe: "+ deins.farbe);
		System.out.println(", Deine Geschw.: " + deins.getTempo());
		
		Auto.reifenanzahl = 4;
		System.out.println("Jedes Auto hat "+Auto.reifenanzahl+ " Reifen.");
	}
}