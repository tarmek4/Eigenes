package CookieClicker;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class CookieMain {
	
	static JLabel counterLabel;
	JLabel perSecLabel;
	static int cookieCounter;
	Font font1, font2;
	CookieHandler cHandler = new CookieHandler();

	public static void main(String[] args) {
		new CookieMain();
		

	}
	public CookieMain() {
		
		cookieCounter = 0;
		createFont();
		createUI();
	}
	
	public void createFont() {
		font1 = new Font("Comic Sans MS", Font.PLAIN,32 );
		font2 = new Font("Comic Sans MS", Font.PLAIN,15 );
	}
	
	public void createUI() {
		
		//fenster erstellen
		JFrame window = new JFrame();
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);		
		window.setLayout(null);
		
		
		//panel erstellen
		JPanel cookiePanel = new JPanel();
		cookiePanel.setBounds(100,220,200,200);
		cookiePanel.setBackground(Color.red);
		cookiePanel.setLayout(new FlowLayout());// Layout-Manager festlegen
		window.add(cookiePanel);
		
//		ImageIcon cookie = new ImageIcon(getClass().getClassLoader().getResource(" "));
		
		
		//button erstellen
		JButton cookieButton = new JButton("                           \n"); 
		cookieButton.setBackground(Color.white);
		cookieButton.setFocusPainted(true);
		cookieButton.setSize(100,490);  //tut nix??
		cookieButton.addActionListener(cHandler);
//		cookieButton.setBorder(null);
//		cookieButton.setIcon(cookie);
		cookiePanel.add(cookieButton);
		
		
		JPanel counterPanel = new JPanel();
		counterPanel.setBounds(100,100,200,100);
		counterPanel.setBackground(Color.blue);
		counterPanel.setLayout(new GridLayout(2,1));
		window.add(counterPanel);
		
		counterLabel = new JLabel(cookieCounter + " cookies");
		counterLabel.setForeground(Color.white);
		counterLabel.setFont(font1);
		counterPanel.add(counterLabel);
		
		perSecLabel = new JLabel();
		perSecLabel.setForeground(Color.white);
		counterPanel.add(perSecLabel);
		
	

		
		
		window.setVisible(true);
	}
	
}


	

