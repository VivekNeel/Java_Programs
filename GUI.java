import javax.swing.JOptionPane;


public class GUI {
	
	public static void main(String[] arg){
	String fn = JOptionPane.showInputDialog("Enter your first no");
	String sc = JOptionPane.showInputDialog("Enter your second no");
	int parsefn = Integer.parseInt(fn);
	int parsesn = Integer.parseInt(sc);
	int sum = parsefn + parsesn ;
	
   JOptionPane.showMessageDialog(null, sum, "The title", JOptionPane.PLAIN_MESSAGE);  
}
}