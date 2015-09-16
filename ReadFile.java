import java.io.File;
import java.util.Formatter;
import java.util.Scanner;


public class ReadFile {
	
	private Scanner s;
	private Formatter f;
	
	String v = "vivek";
	String vs = "vivek";
	String vss = "vivek";
	
	
	public void createFile(){
		try{
			
			f= new Formatter("D:\\tests.txt");
		}catch(Exception e){
				
		}
	}
	public void openFile(){
		try{
		s = new Scanner(new File("D:\\tests.txt"));		
	}catch(Exception e){
			
	}
	}
	
	public void writeFile(){
		f.format("%s %s %s ",v , vs  , vss );
	}

	public void ReadFile(){
		
		while(s.hasNext()){
			String a = s.next();
			String b = s.next();
			
			System.out.printf("%s %s\n" , a , b);
		}
		
	}
	public void closeFile(){
		s.close();
	}
}
