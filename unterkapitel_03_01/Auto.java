package unterkapitel_03_01;

public class Auto {

	public String marke;
	public int tempo;
	public int ps;
	public String farbe;

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