import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Jcombobox extends JFrame{
	
	private JComboBox  box;
	private JLabel picture ;
	
	
	
	private static String[] filename =  {"a.png" , "b.png"};
	private  Icon[]  pics = {new ImageIcon(
			getClass().getResource(filename[0])) , new ImageIcon(
					getClass().getResource(filename[1]))};
	
	public Jcombobox(){
		super("jcombo box title");
		setLayout(new FlowLayout());
		box = new JComboBox(filename);
		add(box);
		picture = new JLabel(pics[0]);
		box.addItemListener(
				new ItemListener(){

					public void itemStateChanged(ItemEvent event) {
						// TODO Auto-generated method stub
						if(event.getStateChange()==ItemEvent.SELECTED)
						picture.setIcon(pics[box.getSelectedIndex()]);
					}
					
					
				}
		                   
				
				
				);
		add(picture);
	}
	

}
