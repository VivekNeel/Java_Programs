import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class Jlist extends JFrame{
	
	private JList list ;
	
	private static String[] filename = {"Black" , "Blue",  "Red" , "Green"};
	private static Color[] color =  {Color.BLACK , Color.BLUE
		,Color.RED , Color.GREEN};
	
	public Jlist(){
		
		super("jlist title");
		setLayout(new FlowLayout());
		list = new JList(filename);
		list.setVisibleRowCount(4);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(new JScrollPane(list));
		
		list.addListSelectionListener(
				new ListSelectionListener(){

					public void valueChanged(ListSelectionEvent event) {
						// TODO Auto-generated method stub
						getContentPane().setBackground(color[list.getSelectedIndex()]);
					}
					
					
				});
		
		
	}

}
