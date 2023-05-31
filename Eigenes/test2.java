package Eigenes;

public class test2 {
	
	public static int schaen_spieler() {
		 
		int schaden_spieler = (int)(Math.random()*8 + 1);
		
		return schaden_spieler;
				
	}

	public static void main(String[] args) {

		System.out.println(schaen_spieler()); 
	}
}