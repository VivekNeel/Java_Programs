import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Jcolorpicker extends JFrame{
	
	
	private JButton button;
	private Color color = (Color.BLACK);
	private JPanel panel;
	public Jcolorpicker(){
		
		super("Jcolor chooser");
		//setLayout(new FlowLayout());
		panel = new JPanel();
		panel.setBackground(new Color(200 , 34 , 55));
		
		button = new JButton("choose");
		
		button.addActionListener(new ActionListener()
		{

			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				color = JColorChooser.showDialog(null , "pick your color", Color.blue);
				panel.setBackground(color);
				
			}
			
			
		});
		add(button , BorderLayout.SOUTH);
		add(panel , BorderLayout.CENTER);
	}

}
