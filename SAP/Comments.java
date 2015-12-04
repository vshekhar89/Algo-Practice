package SAP;

import java.util.Scanner;

public class Comments {

	
	public static void main(String args[]){
		String input="\// this is a comment \r\n
			{ // another comment \r\n
				   true, \"foo\", // 3rd comment \r\n
				   \"http://www.ariba.com" // comment after URL
				}";

		String s="nrew String";
	}
	
	
	public static String stripComments(String code){
		
		boolean insideComment=true;
		boolean outsideComment= false;
		
		String result="";
		Scanner sc= new Scanner(code);
		sc.useDelimiter("");
		while(sc.hasNext()){
			String s1= sc.next();
			
			if(s1=="//" && outsideComment==false){
				insideComment= true;
				while(s1 !="\n"){
					s1= sc.next();
				}
				insideComment=false;
			}
			else if(s1=="\"" && insideComment==false){
				outsideComment=true;
				while(s1!="\""){
					result += s1;
					s1=sc.next();
				}
			}
			else{
				result+=s1;
			}
		}
		
		
		return result;
	}
}
