import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;


public class DrawingGraphics extends JPanel {
	
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		
		g.setColor(Color.blue);
		g.fillRect(25 , 25, 100, 60);
		
		g.setColor(Color.cyan);
		g.drawString("Hello" , 200, 300);
	}

}
