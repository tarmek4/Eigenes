package Eigenes;

import java.util.Scanner;

public class sfg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner3 = new Scanner(System.in);
		String name_oger = "";

		if (scanner3.hasNext()) {
			name_oger = scanner3.next();
		}

		if (name_oger.equals("Bonk") || name_oger.equals("bonk")) {

			System.out.println("\"Ach na dann. Komm rein Bonk.\"");
			scanner3.close();
			// Methode einfügen.

		} else {
			System.out.println("\"Das stimmt nicht. Hau ab!\"");			
			
			
			
		}
	}
	}


