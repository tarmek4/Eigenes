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
	JLabel newsLabel;
	int cookieCounter;
	Font font1, font2, font3;
	CookieHandler cHandler = new CookieHandler();

	KlickPlusHandler klickPlusHandler = new KlickPlusHandler();
	JLabel klickPlusLabel;
	int klickPlusKosten = 10;
	int klickPlusAnzahl = 0;

	OmaHandler omaHandler = new OmaHandler();
	JLabel omaLabel;
	int omaKosten = 50;
	int omaAnzahl = 0;
	
	FarmHandler farmHandler = new FarmHandler();
	JLabel farmLabel;
	int farmKosten = 200;
	int farmAnzahl = 0;
	
	BankHandler bankHandler = new BankHandler();
	JLabel bankLabel;
	int bankKosten = 1000;
	int bankAnzahl = 0;

	public static void main(String[] args) {
		new CookieMain();
//		System.out.print("TEST");

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
		font3 = new Font("Comic Sans MS", Font.PLAIN, 20);
	}

	public void createUI() {

		// fenster erstellen
		JFrame window = new JFrame();
		window.setSize(800, 800);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);

		// panel erstellen
		JPanel cookiePanel = new JPanel();
		cookiePanel.setBounds(100, 400, 200, 80);
//		cookiePanel.setBackground(Color.black);
		cookiePanel.setLayout(new FlowLayout());// Layout-Manager festlegen
		window.add(cookiePanel);

//		ImageIcon cookieBild = new ImageIcon(getClass().getResource("cookie2.png").toExternalForm());

		// button erstellen
		JButton cookieButton = new JButton(" COOKIE!! ");
		cookieButton.setBackground(Color.white);
		cookieButton.setFocusPainted(true);
		cookieButton.setSize(100, 50); // tut nix??
		cookieButton.addActionListener(cHandler);
		cookieButton.setFont(font1);
//		cookieButton.setBorder(null);
//		cookieButton.setIcon(cookieBild);
		cookiePanel.add(cookieButton);

		JPanel counterPanel = new JPanel();
		counterPanel.setBounds(100, 100, 250, 100);
		counterPanel.setBackground(Color.red);
		counterPanel.setLayout(new GridLayout(2, 1));
		window.add(counterPanel);
		
		JPanel newsPanel = new JPanel();
		newsPanel.setBounds(20, 20, 700, 50);
		newsPanel.setBackground(Color.red);
		window.add(newsPanel);
		
		
		newsLabel = new JLabel("");
		newsLabel.setForeground(Color.white);
		newsLabel.setFont(font3);
		newsPanel.add(newsLabel);

		counterLabel = new JLabel(cookieCounter + " cookies");
		counterLabel.setForeground(Color.white);
		counterLabel.setFont(font1);
		counterPanel.add(counterLabel);

		perSecLabel = new JLabel();
		perSecLabel.setForeground(Color.white);
		counterPanel.add(perSecLabel);

		JPanel upgradePanel = new JPanel();
		upgradePanel.setBounds(400, 100, 350, 500);
		upgradePanel.setBackground(Color.black);
//		counterPanel.setLayout(new GridLayout(2, 1));// legt Layout-Manager fest
		window.add(upgradePanel);

		// klickPlus Anfang
		klickPlusLabel = new JLabel("KlickPlus: " + klickPlusAnzahl + " Kosten: " + klickPlusKosten);
		klickPlusLabel.setForeground(Color.white);
		klickPlusLabel.setFont(font3);
		upgradePanel.add(klickPlusLabel);

		JButton klickPlusButton = new JButton("KlickPlus!!");
		klickPlusButton.setBackground(Color.white);
		klickPlusButton.setFocusPainted(true);
		klickPlusButton.addActionListener(klickPlusHandler);
		upgradePanel.add(klickPlusButton);
		// klickPlus Ende

		// OMAS Anfang
		omaLabel = new JLabel("Omas: " + omaAnzahl + " Kosten: " + omaKosten);
		omaLabel.setForeground(Color.white);
		omaLabel.setFont(font3);
		upgradePanel.add(omaLabel);

		JButton omaButton = new JButton("OMA!!");
		omaButton.setBackground(Color.white);
		omaButton.setFocusPainted(true);
		omaButton.addActionListener(omaHandler);
		upgradePanel.add(omaButton);
		// OMAS Ende
		
		
		// FARMS Anfang
		farmLabel = new JLabel("Farms: " + farmAnzahl + " Kosten: " + farmKosten);
		farmLabel.setForeground(Color.white);
		farmLabel.setFont(font3);
		upgradePanel.add(farmLabel);

		JButton farmButton = new JButton("Farm!!");
		farmButton.setBackground(Color.white);
		farmButton.setFocusPainted(true);
		farmButton.addActionListener(farmHandler);
		upgradePanel.add(farmButton);
		// FARMS Ende
		
		
		// Banken Anfang
		bankLabel = new JLabel("Bankens: " + bankAnzahl + " Kosten: " + bankKosten);
		bankLabel.setForeground(Color.white);
		bankLabel.setFont(font3);
		upgradePanel.add(bankLabel);

		JButton bankButton = new JButton("Bank!!");
		bankButton.setBackground(Color.white);
		bankButton.setFocusPainted(true);
		bankButton.addActionListener(bankHandler);
		upgradePanel.add(bankButton);
		// Banken Ende

		window.setVisible(true);
	}

	class CookieHandler implements ActionListener { // wird ausgeführt beim Drücken des Cookie-Buttons

		public void actionPerformed(ActionEvent event) {
			cookieCounter += (1 + 1 * klickPlusAnzahl);
			counterLabel.setText(cookieCounter + " cookies");
		}

	}

	class OmaHandler implements ActionListener { // wird ausgeführt beim Drücken des Oma-Buttons

		public void actionPerformed(ActionEvent event) {
			if (cookieCounter >= omaKosten) {
				cookieCounter -= omaKosten;
				omaAnzahl++;
				omaKosten *= 2;
				omaLabel.setText("Omas: " + omaAnzahl + " Kosten: " + omaKosten);
				counterLabel.setText(cookieCounter + " cookies");

			}
		}

	}

	class KlickPlusHandler implements ActionListener { // wird ausgeführt beim Drücken des KlickPlus-Buttons

		public void actionPerformed(ActionEvent event) {
			if (cookieCounter >= klickPlusKosten) {
				cookieCounter -= klickPlusKosten;
				klickPlusAnzahl++;
				klickPlusKosten *= 2;
				klickPlusLabel.setText("KlickPlus: +" + klickPlusAnzahl + " Kosten: " + klickPlusKosten);
				counterLabel.setText(cookieCounter + " cookies");

			}
		}
	}
	
	class FarmHandler implements ActionListener { // wird ausgeführt beim Drücken des Oma-Buttons

		public void actionPerformed(ActionEvent event) {
			if (cookieCounter >= farmKosten) {
				cookieCounter -= farmKosten;
				farmAnzahl++;
				farmKosten *= 2;
				farmLabel.setText("Farms: " + farmAnzahl + " Kosten: " + farmKosten);
				counterLabel.setText(cookieCounter + " cookies");

			}
		}

	}
	
	class BankHandler implements ActionListener { // wird ausgeführt beim Drücken des Oma-Buttons

		public void actionPerformed(ActionEvent event) {
			if (cookieCounter >= bankKosten) {
				cookieCounter -= bankKosten;
				bankAnzahl++;
				bankKosten *= 2;
				bankLabel.setText("Banken: " + bankAnzahl + " Kosten: " + bankKosten);
				counterLabel.setText(cookieCounter + " cookies");

			}
		}

	}
	
	int newsCounter = 0;
	public void Backen() {

		cookieCounter += omaAnzahl;
		cookieCounter += farmAnzahl*4;
		cookieCounter += bankAnzahl*20;
		counterLabel.setText(cookieCounter + " cookies");
		
		newsCounter++;
				
		if (newsCounter >= 50) {
			newsCounter = 0;
			Newsflash();
		}
		

	}
	int zufall2 = 0;
	int zufall = 0;
	public void Newsflash() {
		
		
		String[] news = {
				"Kauft Mehr Cookies!!!",
				"\"COOKIES!!!\" Cookie Monster",
				"Cookies sind lecker!",
				"Schokolade!"
								
		};
		
//	
//		int zufall= (int)(Math.random()*news.length);
//		if (zufall != zufall2) {
//			newsLabel.setText(news[zufall]);
//			zufall2 = zufall;
//		}
//		
//		
		
		newsLabel.setText(news[(int)(Math.random()*news.length)]);
		
//		System.out.print(zufall);
	
	
	}

}
