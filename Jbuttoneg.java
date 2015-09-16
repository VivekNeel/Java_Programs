import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;





public class Jbuttoneg  extends JFrame{
	
	private JButton first;
	private JButton second;
	
	public Jbuttoneg(){
		
		super("Button title");
		setLayout(new FlowLayout());
		first  = new JButton("first");
		add(first);
		second = new JButton("second");
		
		Icon i = new ImageIcon(getClass().getResource("a.png"));
		second.setIcon(i);
		add(second);
		
		// Adding listener to the buttons
		Handler theHandler = new Handler();
		first.addActionListener(theHandler);
		second.addActionListener(theHandler);
		
		
		
		
	}
	 
	private class Handler implements ActionListener{
	 
		public void actionPerformed(ActionEvent event){
			
			if(event.getSource()==first)
			JOptionPane.showMessageDialog(null ,"Hi");
			else if(event.getSource()==second)
				JOptionPane.showMessageDialog(null ,"bye");
			
			
		}
		
	}
	
	

}
