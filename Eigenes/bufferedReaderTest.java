// Java Program to Illustrate BufferedReader Class

package Eigenes;
// Importing required class
import java.io.*;

// Main class
class bufferedReaderTest {

	// Main driver method
	public static void main(String args[])
		throws IOException
	{

		// Creating object of class inside main() method
		BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));

		System.out.println("Enter an integer");

		// Taking integer input
		int a = Integer.parseInt(br.readLine());

		System.out.println("Enter a String");

		String b = br.readLine();

		// Printing input entities above
		System.out.printf("You have entered:- " + a
						+ " and name as " + b);
	}
}
