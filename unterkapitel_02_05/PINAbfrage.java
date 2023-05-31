package unterkapitel_02_05;

public class PINAbfrage {
	
	static int pin = 1234;
	
	public static void main(String[] args) {

		
		
		int eingabe;
		int zaehler = 0;
		do {
			System.out.print("Bitte geben Sie Ihre eingabe ein: ");
			eingabe = leseInteger();
			zaehler ++;		
			
		} while (zaehler <3 && eingabe != pin);
		
		
		if (eingabe == pin) {
			System.out.print("Zugriff gewährt!");
		}
		else {
			System.out.print("Zugriff verweigert!");
		}
		

	}

	

	public static int leseInteger() {
		java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		try {
			return Integer.parseInt(br.readLine());
		} catch (Exception ex) {
			return pin +1;
			
		}
	}
}
