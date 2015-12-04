package general;
//counts the number of consecutive occurances of a character in a string
public class charCount {
	
	
	public static void countChars(String src){
		String myStr= "";
		char first= src.charAt(0);
		int count=0;
		
		for(int i=0; i<src.length();i++){
			if(src.charAt(i)==first){
				count++;
			}
			else{
				myStr=myStr+first+count;
				count=1;
				first=src.charAt(i+1);
				
			}
			
		}
		myStr=myStr+first+count;
		
		System.out.println(myStr);
	}
	
	public static void main(String args[]){
		String src="aaaaabbbbbcccdddeeeaaakkkkggg";
		countChars(src);
	}

}
