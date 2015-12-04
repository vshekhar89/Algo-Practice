package SAP;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class removeComments {
public static void main(String args[]) throws FileNotFoundException{
		
		boolean insideComment=true;
		boolean outsideComment= false;
		File file = new File("/Users/shardendu/myfile.txt");
		
		String result="";
		Scanner sc= new Scanner(file);
		sc.useDelimiter("");
		while(sc.hasNext()){
			String s1= sc.next();
			
			if(s1.equals("/") && outsideComment==false){
				String s2= sc.next();
				if(s2.equals("/")){
					insideComment= true;
					while(!s2.equals("x") && sc.hasNext()){
					s2= sc.next();
				}
				insideComment=false;
				}
			}
			else if(s1.equals("\"") && insideComment==false){
				outsideComment=true;
				String s2= sc.next();
				result += s1;
				while(!s2.equals("\"") && sc.hasNext()){
					result += s2;
					s2=sc.next();
				}
				result+=s2;
				outsideComment=false;
			}
			else{
				result+=s1;
			}
		}
		sc.close();
		
		System.out.println(result);
	}

}
