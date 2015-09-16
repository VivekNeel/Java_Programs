
public class StringDisplay {
	
	private int month ;
	private int day ;
	private int year ;
	 
	StringDisplay(int month , int day , int year){
		this.month = month ;
		this.day =day ;
		this.year = year ;
		
		System.out.printf("I'm the constructor %s" , this);
	}
	
	public String toString(){
		return String.format("%s\t%s\t%s", month , day , year);
	}

}
