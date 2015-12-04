package facebook;

public class CharCount {
	
	
	public static void charcount(String src){
		int count =0;
		String temp="";
		char first=src.charAt(0);
		for(int i=0; i<src.length();i++){
			if(src.charAt(i)==first){
				count++;
			}else{
				temp= temp+first+count;
				count=1;
				first= src.charAt(i);
			}
		}
		temp=temp+first+count;
		System.out.println(temp);
		
	}
	
	public static void main(String args[]){
		String src= "aaaaaaabbbbbbccccccjjjjjjddddd";
		charcount(src);
	}

}
