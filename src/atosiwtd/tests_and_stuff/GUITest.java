package atosiwtd.tests_and_stuff;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class GUITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean appear = false;
		JFrame theGUI = new JFrame();
		theGUI.setTitle("GUI Program");
		theGUI.setSize(300, 200);
		theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ColorPanel panel = new ColorPanel(Color.white);
		Container pane = theGUI.getContentPane();
		Button button = new Button("Press for free mons");
		button.setSize(150, 30);
		pane.add(button);
		pane.add(panel);
		theGUI.setVisible(true);

		button.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				if (!appear) {
					panel.setVisible(true);
				} else {
					panel.setVisible(false);
				}
			}
		});
	}

}
