package CookieClicker;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;

public class ButtonExample {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Button Example");
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout()); // Layout-Manager festlegen

		JButton button = new JButton("Click Me");
		button.setSize(400, 500); // Größe des Buttons festlegen (optional)

		panel.add(button);
		frame.add(panel);
		frame.setSize(500, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
