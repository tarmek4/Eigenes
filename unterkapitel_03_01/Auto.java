package unterkapitel_03_01;

public class Auto {

	private String marke;
	private int tempo;
	public int ps;
	public String farbe;

	public static int reifenanzahl;

	public void beschleunige() {
		tempo += 10;
		if (tempo > 180)
			tempo = 180;
	}

	public void bremse() {
		tempo -= 10;
		if (tempo < 0)
			tempo = 0;
	}

	public String getMarke() {
		return marke;
	}

	public void setMarke(String marke) {
		this.marke = marke;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int a) {
		tempo = a;
	}

}
