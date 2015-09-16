import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class Madapter extends JFrame {
	
	
	private String details ;
	private JLabel text ;
	
	
	public Madapter(){
		
		super("Mouse adapter");
		
		text = new JLabel("This is default"); 
		
		add(text , BorderLayout.SOUTH);
		addMouseListener(new MouseClass());
	}
     private class MouseClass extends MouseAdapter{
    	 
    	 public void mouseClicked(MouseEvent event){
    		 details = String.format("You clicked %d times", event.getClickCount());
    		 if(event.isMetaDown())
    			 details += "Hey";
    		 else if(event.isAltDown())
    			 details = details + "Bye";
    		 else
    			 details = details + "d";
    		 text.setText(details);
    	 }
    	 
    	 public void mousePressed(MouseEvent event){
    		 text.setText("You pressed");
    	 } 
    	 
    	 
     }
     
}
