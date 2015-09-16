import java.io.File;
import java.io.FileNotFoundException;


public class Fileclass {
      
	public static void main(String[] a) throws FileNotFoundException{
		
	
		File check = new File("D:\\Vivek\\JavaLearnings.xml");
		if(check.exists())
			System.out.println("The file exists");
		else
			System.out.println("The file doesn't exist");
		
		
		
	}
}
