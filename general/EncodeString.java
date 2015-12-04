package general;

public class EncodeString {
	
	public static void encodeString(String src){
		
		int spcount=0;
		for(int i=0; i<src.length();i++){
			if(src.charAt(i)==' '){
				spcount++;
			}
		}
		int strpointer=0;
		char[] str= new char[src.length()+(spcount*2)+1];
		
		for(int i=0; i<src.length();i++){
			
			if(src.charAt(i)==' '){
				str[strpointer+1]='%';
				str[strpointer+2]='2';
				str[strpointer+3]='0';
				strpointer+=3;
				
			}else{
				str[strpointer+1]=src.charAt(i);
				strpointer++;
				
			}
		}
		System.out.println(str);
		
	}
	
	public static void main(String args[]){
		String src= "This is a test String";
		encodeString(src);
	}

}
