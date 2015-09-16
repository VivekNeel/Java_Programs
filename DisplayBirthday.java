
  public class DisplayBirthday {
    
	  
	  private String name ;
	  private StringDisplay birthday ;
	  
	  DisplayBirthday(String n , StringDisplay b){
		  name = n ;
		  birthday = b ;
	  }  
	  
	 
	  
	  public String toString(){
		  
		  return String.format("My name is %s , My birthday is % s " , name , birthday );
	  }
	  }
	  
	  
	  

