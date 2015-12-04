package searching;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConvert {

	
	public static void main(String args[]){
		String day_a="01/01";
		String day_b="02/02";
		 SimpleDateFormat formatter= new SimpleDateFormat("MM/dd/yyyy");
	        String firstDate= day_a+"/2015";
	        String nextDate= day_b+"/2015";
	        
	        try{
	            Date date1= formatter.parse(firstDate);
	            Date date2= formatter.parse(nextDate);
	            long diffr= date2.getTime() - date1.getTime();
		        long diffindays= diffr/(24*60*60*1000);
		        System.out.print(diffindays);
		       
	        }catch(ParseException e){
	            e.printStackTrace();
	        }
	        
	        
	        
	       
	}
}
