package unterkapitel_02_06;

public class GroessteZahl {

	public static void main(String[] args) {

//		int[] zahlen = { 33, 55, -100, 50, 500, };
//		int groessteZahl = zahlen[0];
//
//		for (int i = 1; i < zahlen.length; i++) {
//
//			if (zahlen[i] > groessteZahl) {
//				groessteZahl = zahlen[i];
//			}
//		}
//		
//		System.out.print(groessteZahl);
		
		
		int[] zahlen = { 33, 55, -100, 50, 500, };
		int groessteZahl = zahlen[0];
		
		for (int zahl:zahlen) {
			if (zahl > groessteZahl) {
				groessteZahl = zahl;
			}
		}
		
		System.out.print(groessteZahl);
		
		
		
		

	}

}
