import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class Jcheckbox extends JFrame{
	
	
	private JTextField text ;
	private JCheckBox bold ;
	private JCheckBox italic ;
	
	public Jcheckbox(){
	super("Jcheck box title");
setLayout(new FlowLayout());
	
	text = new JTextField("Change the textStyle");
	Font font = new Font("serif", Font.BOLD , 23);
	add(text);
	
	bold = new JCheckBox("bold");
	add(bold);
	
	italic = new JCheckBox("italic");
	add(italic);
	
	Handler the = new Handler();
	bold.addItemListener(the);
	italic.addItemListener(the);
	
	
	
	}
	
	private class Handler implements ItemListener{
		
		

		public void itemStateChanged(ItemEvent event) {
			// TODO Auto-generated method stub
			Font font = null;
			if(bold.isSelected() && italic.isSelected())
				font = new Font("serif" , Font.BOLD + Font.ITALIC , 23);
			else if(bold.isSelected())
				font = new Font("serif" , Font.BOLD, 23);
			else if(italic.isSelected())
				font = new Font("serif" , Font.ITALIC , 23);
			else
				font = new Font("serif" , Font.PLAIN , 40);
			text.setFont(font);
			
		}
	}
}
