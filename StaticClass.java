
public class StaticClass { 
	
	private String first ;
	private String second ;
	private static int members = 0 ;
	
	public StaticClass(String f , String s){
		first = f;
		second = s;
		members++;
				
	} 
	
	public String getFirst(){
		return first;
	}
	public String getSecond(){
		return second ;
		
	}
	
	public static int getMembers(){
		return members ;
	}

}
