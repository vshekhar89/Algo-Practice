
public class countChars {

	
	public static void main(String args[]){
		String org="aaabbbcccddd";
		String mystr="";
		
		char last= org.charAt(0);
		int count=1;
		for(int i=1; i<org.length();i++){
			if(org.charAt(i)==last){
				count++;
			}else{
				mystr=mystr+last+count;
				count=1;
				last=org.charAt(i);
			}
		}
		
		System.out.println(mystr+last+count);
		
	}
}
