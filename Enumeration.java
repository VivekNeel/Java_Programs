 
public enum Enumeration {
    
	
	samsung("good"),
	sony("not bad"),
	oneplus("excellent"),
	appple("awesome");
	
	private final String desc ;
	Enumeration(String desc){
		this.desc = desc ;
		
	}
	
	public String getDesc(){
		return desc ;
	}
	
	
} 
