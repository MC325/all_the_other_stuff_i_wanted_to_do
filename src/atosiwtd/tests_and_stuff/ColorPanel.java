package atosiwtd.tests_and_stuff;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ColorPanel extends JPanel {
	public ColorPanel(Color backColor) {
		setBackground(backColor);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int x = getWidth() / 2 - 60;
		int y = getHeight() / 2;
		g.setColor(Color.blue);
		g.drawRect(x, y, 120, 20);
		g.setColor(Color.red);
		Font font = new Font("Courier", Font.BOLD, 40);
		g.setFont(font);
		g.drawString("Hello World!", x + 10, y + 15);
		
	}

}
