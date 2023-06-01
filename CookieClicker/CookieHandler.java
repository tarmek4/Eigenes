
package CookieClicker;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CookieHandler implements ActionListener{
	
	public void actionPerformed(ActionEvent event) {
		CookieMain.cookieCounter++;
		CookieMain.counterLabel.setText(CookieMain.cookieCounter+ " cookies");
	}
	
}