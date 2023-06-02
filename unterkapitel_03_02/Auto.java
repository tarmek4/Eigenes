package unterkapitel_03_02;

public class Auto {

	public String marke;
	public int tempo;
	public int ps;

	public Auto() {
		marke = "unbekannt";
		tempo = 0;
		ps = 50;
	}
	
	public Auto(String m) {
		marke = m;
		tempo = 0;
		ps = 0;
	}
	
	public Auto ( String m, int ps, int t ) {
		marke = m;
		this.ps = ps;
		tempo = t;
	}

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

}