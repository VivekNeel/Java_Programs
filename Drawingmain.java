import javax.swing.JFrame;


public class Drawingmain extends JFrame {
	
	public static void main(String[] a){
	
	JFrame j = new JFrame("Drawing");
	DrawingGraphics dos= new DrawingGraphics();
	j.add(dos);
	j.setSize(200,300);
	j.setVisible(true);
	j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
