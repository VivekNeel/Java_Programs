
public class SetTimeClass {
	
	private int hour;
	private int minute ;
	private int seconds ;
	
	public void setTime(int hour , int minute , int seconds){
		this.hour =  ((hour >=0 && hour <24) ? hour : 0);
		this.minute =  ((minute >=0 && minute <60) ? minute : 0);
		this.seconds =  ((seconds >=0 && hour <60) ? seconds : 0);
		
		
		
	}
	
	public String toMilitaryTime(){
		return String.format("%02d:%02d:%02d %s", hour , minute , seconds ,
				(hour <12 ? "AM" : "PM"));
	}

}
