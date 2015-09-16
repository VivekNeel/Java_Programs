import java.io.FileNotFoundException;
import java.util.Formatter;


public class Createfile {
   
	private Formatter file;
	private String print = "Java for the win";
	public void check(){
		 
		try {
			file = new Formatter("test.text");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error");
		}
		
	}
	
	public void write(){
		
		file.format("%s" , print);
	}
	
	public void close(){
		file.close();
	}
}
