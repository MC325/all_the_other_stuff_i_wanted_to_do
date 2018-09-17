package atosiwtd.gui.gui1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class LoginButtonListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		if (LoginView1.password == "abcd1234") {
			JOptionPane.showMessageDialog(null, "You have successfully logged in.");
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect password.");
		}
	}
}