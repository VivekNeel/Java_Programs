import java.awt.Graphics;
import java.util.*;
import javax.swing.*;


public class InitApple extends JApplet {
	
	double  remainder ;
	
	public void init(){
		
		String fn = JOptionPane.showInputDialog("Enter the first number");
		String sn = JOptionPane.showInputDialog("Enter the second number");
		double parse = Double.parseDouble(fn);
		double parseSn = Double.parseDouble(sn);
		
		remainder = parse / parseSn ;
		
		
	}
	
	public void Print(Graphics g){
		
		 super.print(g);
		 g.drawString("The remainder is" + remainder , 25, 30);
	}

}
