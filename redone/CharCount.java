package redone;

public class CharCount {

	
	public static void main(String args[]){
		
		String src="aaaaabbbbdddrrruuuujhhjbjsdkuu";
		
		int count=0;;
		String myStr="";
		char first=src.charAt(0);
		
		for(int i=0; i<src.length();i++){
			if(src.charAt(i)==first){
				count++;
			}else{
				myStr=myStr+first+count;
				count=1;
				first=src.charAt(i);
			}
		}
		myStr= myStr+first+count;
		
		System.out.println(myStr);
		
	}
}
