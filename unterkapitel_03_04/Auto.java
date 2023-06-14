package unterkapitel_03_04;

public class Auto {

	private String marke;
	private int tempo;
	private int ps;
	private int bla;
	private int sdf;

	public Auto() {
		marke = "unbekannt";
		tempo = 0;
		ps = 0;
	}

	public void setSpeed(int s) {
		if (s >= 0 && s <= 180) {
			tempo = s;
		}
	}

	public int getSpeed() {
		return tempo;
	}

	public void setPower(int p) {
		if (p >= 40 && p <= 300) {
			ps = p;
		}else {
			System.out.println("Auto.setPower: Fehler! Umgültiger PS-Wert: \""+ p + "\" Gültige Werte liegen zwischen 0 und 300.");
		}
	}
	
	public int getPower() {
		return ps;
	}
	
	public void setMarke(String m) {
		if (m.equals("BMW") || m.equals("Mercedes") || m.equals("Toyota") || m.equals("VW")){
			marke = m;
		}else {
			System.out.println("auto.setMarke: Fehler! Ungültige Marke: \""+m+"\" Gültige Marken sind BMW, Mercedes, Toyota, VW.");
		}
	}
	
	public String getMarke() {
		return marke;
	}

	/**
	 * @return the bla
	 */
	public int getBla() {
		return bla;
	}

	/**
	 * @param bla the bla to set
	 */
	public void setBla(int bla) {
		this.bla = bla;
	}



}