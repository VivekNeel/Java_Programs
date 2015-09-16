import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.ChangeListener;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;




public class Jframe extends JFrame {
  
	private JLabel item1;
    private JTextField  item2 ;
    private JTextField  item3 ;
    private JPasswordField  pw ;
    
	public Jframe(){
		super("The title bar");
		setLayout(new FlowLayout());
		
		item1 = new JLabel("ITEM 1");
		add(item1);
		item2 = new JTextField("Enter text here");
		add(item2);
		item3 = new JTextField(20);
		item3.setEditable(false);
		add(item3);
		pw = new JPasswordField("Enter password");
		add(pw);
		
		theHandler handler = new theHandler();
		item2.addActionListener(handler);
		item3.addActionListener(handler);
		pw.addActionListener(handler);
		
	} 
	
	private class theHandler implements ActionListener{
		String string = "";
		public void actionPerformed(ActionEvent event){
			
			if(event.getSource()==item2)
				string = event.getActionCommand();
			else if(event.getSource()==item3)
			string = "meh";
			else if(event.getSource()==pw)
		 string = String.format("Password text is: %s", event.getActionCommand());
		JOptionPane.showMessageDialog(null, string);
		
		}
		
	}
	
}
