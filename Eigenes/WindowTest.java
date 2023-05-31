package Eigenes;

import javax.swing.JFrame;

public class WindowTest {

	public static void main(String[] args) {
		
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setTitle("Test");
		
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	
	}

}
