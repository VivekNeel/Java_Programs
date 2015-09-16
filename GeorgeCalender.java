import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class GeorgeCalender
{
public static void main(String[] a) throws NumberFormatException, IOException{

BufferedReader  st = new BufferedReader(new InputStreamReader(System.in));
int i = Integer.parseInt(st.readLine());
while(i>0){

 int year = Integer.parseInt(st.readLine())-1;
 String[] days = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
 System.out.print(days[(year*365+year/4-year/100+
   year/400+1-693595)%7]) ;

} 




}



}