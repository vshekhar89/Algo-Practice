package redo;

public class CharCount2 {

	
	public static void main(String args[]){
		
		String src="aaabbbcccccccddddddeeeeeeee";
		
		char last=src.charAt(0);
		int count=0;
		String res= "";
		
		for(int i=0; i<src.length();i++){
			if(src.charAt(i)==last){
				count++;
			}else{
				res=res+last+count;
				count=1;
				last=src.charAt(i+1);
			}
		}
		res=res+last+count;
		System.out.println(res);
		
	}
}
