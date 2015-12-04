package redo;

public class charCount {

	
	public static void main(String args[]){
	
		String src="aaaaabbbbaacccyyyy";
		int count=0;
		String myStr="";
		char first=src.charAt(0);
		for(int i=0; i<src.length();i++){
			if(first==src.charAt(i)){
				count++;
			}else{
				myStr=myStr+first+count;
				count=1;
				first=src.charAt(i+1);
				
			}
		}
		myStr=myStr+first+count;
		System.out.println(myStr);
		
		
	}
}
