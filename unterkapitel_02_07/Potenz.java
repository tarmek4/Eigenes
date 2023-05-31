package unterkapitel_02_07;

public class Potenz {

	public static void main(String[] args) {
	
		int a = 10;
		int b = 3;
				
		System.out.print(potenz(a,b));
	}

	public static int potenz(int a, int b) {
		
		int wert = 1;
		for ( int i = 0; i < b; i++) {
			
			 wert *= a;
		}
		return wert;
		
	}
	
	
}
