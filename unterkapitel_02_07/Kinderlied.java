package unterkapitel_02_07;

public class Kinderlied {

	public static void main(String[] args) {
		summ();
		ersteStrophe();
		summ();
		System.out.println();
		summ();
		zweiteStrophe();
		summ();

	}

	
	
	  public static void summ () {
	      System.out.print   ("Summ, Summ, Summ, ");
	      System.out.println ("Bienchen, summ herum.");
	    }
	    
	    public static void ersteStrophe () {
	      System.out.print   ("Ei, wir tun dir nichts zuleide, ");
	      System.out.println ("flieg nur über Wald und Heide!");
	    }
	    
	    public static void zweiteStrophe () {
	      System.out.print   ("Such in Blumen, such in Blümchen ");
	      System.out.println ("dir ein Tröpfchen, dir ein Krümchen!");
	    }
}
