package Eigenes;

public class stringtest2 {

	public static void main(String[] args) {
		String test = "   Hallo was hier los? was   ";
		int laenge = test.length();
		String suche = "was";
		String suche2 = "hier";
		int was = test.indexOf(suche);
		
		
		System.out.println(test);
		System.out.println(laenge);
		System.out.println(test.trim());
		System.out.println(was);
		
		System.out.println(test.substring(was));
		
		int c = 7;
		c = - -c * - - c;
		System.out.println(c); 
	}

}
