import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MousePanel extends JFrame{
	
	private JPanel mousePanel;
	private JLabel item;
	
	public MousePanel(){
		
		super("Mouse panel");
		
		mousePanel = new JPanel();
		mousePanel.setBackground(Color.RED);
		add(mousePanel , BorderLayout.CENTER);
		item = new JLabel("Hi i'm the robot");
		add(item , BorderLayout.SOUTH);
		Listener listener = new Listener();
	mousePanel.addMouseListener(listener);

	
	
		
	}
	
	private class Listener implements MouseListener , MouseMotionListener{
  // MouseMotionListener
		public void mouseDragged(MouseEvent arg0) {
			// TODO Auto-generated method stub
			item.setText("You dragged");
		}

		public void mouseMoved(MouseEvent arg0) {
			// TODO Auto-generated method stub
			item.setText("You moved");
		}
// MouseListener 
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			item.setText(String.format("You clicked at %d %d " , arg0.getX() , arg0.getY()));
		}

		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			item.setText("You entered into the mouse panel");
			mousePanel.setBackground(Color.BLACK);
		}

		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			item.setText("You exited from the mouse panel");
			mousePanel.setBackground(Color.BLUE);
		}

		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			item.setText("You pressed");
			
		}

		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			item.setText("you released");
		}

	
		
		
		
		
	}

}
