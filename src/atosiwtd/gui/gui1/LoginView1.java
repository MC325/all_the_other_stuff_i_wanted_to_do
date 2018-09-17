package atosiwtd.gui.gui1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginView1 {
	static String password;
	static JPasswordField passwordText = new JPasswordField(20);
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Password");
		frame.setSize(900, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		placeComponents(frame);
		frame.setVisible(true);
	}

	private static void placeComponents(JFrame frame) {
		frame.setLayout(null);

		JLabel userLabel = new JLabel("User");
		userLabel.setBounds(10, 10, 80, 25);
		frame.add(userLabel);

		JTextField userText = new JTextField(20);
		userText.setBounds(100, 10, 160, 25);
		frame.add(userText);

		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 40, 80, 25);
		frame.add(passwordLabel);

		
		passwordText.setBounds(100, 40, 160, 25);
		frame.add(passwordText);

		JButton loginButton = new JButton("login");
		loginButton.setBounds(10, 80, 80, 25);
		frame.add(loginButton);

		JButton registerButton = new JButton("register");
		registerButton.setBounds(180, 80, 80, 25);
		frame.add(registerButton);

		ActionListener loginButtonListener = new LoginButtonListener();
		loginButton.addActionListener(loginButtonListener);
	}
	public void actionPerformed(ActionEvent e) {
		String password = passwordText.getText();
		if (LoginView1.password == "abcd1234") {
			JOptionPane.showMessageDialog(null, "You have successfully logged in.");
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect password.");
		}
	}
}