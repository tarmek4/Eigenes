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

import java.util.Timer;
import java.util.TimerTask;

public class CookieMain {

	JLabel counterLabel;
	JLabel perSecLabel;
	int cookieCounter;
	Font font1, font2;
	CookieHandler cHandler = new CookieHandler();
	OmaHandler omaHandler = new OmaHandler();

	JLabel omaLabel;
	int omaKosten = 50;
	int omaAnzahl = 0;

	public static void main(String[] args) {
		new CookieMain();

	}

	public CookieMain() {

		cookieCounter = 5000;
		createFont();
		createUI();
		Timer timer = new Timer();

		
		TimerTask task = new TimerTask() {

			public void run() {
				
				Backen();
				
				

			}
		};
		
		
			timer.schedule(task, 0, 100);
		

	}

	public void createFont() {
		font1 = new Font("Comic Sans MS", Font.PLAIN, 32);
		font2 = new Font("Comic Sans MS", Font.PLAIN, 15);
	}

	public void createUI() {

		// fenster erstellen
		JFrame window = new JFrame();
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);

		// panel erstellen
		JPanel cookiePanel = new JPanel();
		cookiePanel.setBounds(100, 220, 200, 200);
		cookiePanel.setBackground(Color.red);
		cookiePanel.setLayout(new FlowLayout());// Layout-Manager festlegen
		window.add(cookiePanel);

//		ImageIcon cookie = new ImageIcon(getClass().getClassLoader().getResource(" "));

		// button erstellen
		JButton cookieButton = new JButton("                           \n");
		cookieButton.setBackground(Color.white);
		cookieButton.setFocusPainted(true);
		cookieButton.setSize(100, 490); // tut nix??
		cookieButton.addActionListener(cHandler);
//		cookieButton.setBorder(null);
//		cookieButton.setIcon(cookie);
		cookiePanel.add(cookieButton);

		JPanel counterPanel = new JPanel();
		counterPanel.setBounds(100, 100, 200, 100);
		counterPanel.setBackground(Color.blue);
		counterPanel.setLayout(new GridLayout(2, 1));
		window.add(counterPanel);

		counterLabel = new JLabel(cookieCounter + " cookies");
		counterLabel.setForeground(Color.white);
		counterLabel.setFont(font1);
		counterPanel.add(counterLabel);

		perSecLabel = new JLabel();
		perSecLabel.setForeground(Color.white);
		counterPanel.add(perSecLabel);

		JPanel omaPanel = new JPanel();
		omaPanel.setBounds(400, 100, 350, 100);
		omaPanel.setBackground(Color.red);
		counterPanel.setLayout(new GridLayout(2, 1));// legt Layout-Manager fest
		window.add(omaPanel);

		omaLabel = new JLabel("Anzahl: " + omaAnzahl + " Kosten: " + omaKosten);
		omaLabel.setForeground(Color.white);
		omaLabel.setFont(font1);
		omaPanel.add(omaLabel);

		JButton omaButton = new JButton("OMAs");
		omaButton.setBackground(Color.white);
		omaButton.setFocusPainted(true);
		omaButton.addActionListener(omaHandler);
		omaPanel.add(omaButton);

		window.setVisible(true);
	}

	class CookieHandler implements ActionListener { // wird ausgeführt beim Drücken des Cookie-Buttons

		public void actionPerformed(ActionEvent event) {
			cookieCounter++;
			counterLabel.setText(cookieCounter + " cookies");
		}

	}

	class OmaHandler implements ActionListener { // wird ausgeführt beim Drücken des Oma-Buttons

		public void actionPerformed(ActionEvent event) {
			if (cookieCounter >= omaKosten) {
				cookieCounter -= omaKosten;
				omaAnzahl++;
				omaKosten *= 2;
				omaLabel.setText("Anzahl: " + omaAnzahl + " Kosten: " + omaKosten);
				counterLabel.setText(cookieCounter + " cookies");

			}
		}

	}
	
	public void Backen() {
		
		cookieCounter += omaAnzahl;
		counterLabel.setText(cookieCounter + " cookies");
		
	}

}
