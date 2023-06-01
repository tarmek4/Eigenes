package CookieClicker;

import java.util.Timer;
import java.util.TimerTask;

public class ScheduledTask {

	public static void main(String[] args) {
		Timer timer = new Timer();

		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				// Hier kannst du den Code einfügen, der automatisch ausgeführt werden soll
				System.out.println("Automatische Aufgabe wird ausgeführt");
			}
		};

		// Zeitplan für die Ausführung festlegen (hier alle 5 Sekunden)
		timer.schedule(task, 0, 5000);
	}
}
