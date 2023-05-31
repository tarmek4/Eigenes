package unterkapitel_02_05;

public class Einmaleins2 {

	public static void main(String[] args) {
		
		for (int faktor1 = 1 ; faktor1 <= 10; faktor1++) {
			System.out.println ("Das kleine 1*1 mit "+faktor1);
			
			for(int faktor2 = 1; faktor2 <=10; faktor2++) {
				 System.out.print (faktor1 + " mal " + faktor2);
				 System.out.println (" ergibt "+ (faktor1*faktor2));
				
			}
		    System.out.println ();
		}

	}

}
