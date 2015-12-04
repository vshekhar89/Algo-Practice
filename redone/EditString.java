package redone;

public class EditString {
	
	public static void main(String args[]){
		String src="This is a test string";
		char[] str= src.toCharArray();
		
		
		int spaceCount=0;
		
		for(int i=0; i<src.length();i++){
			if(src.charAt(i)==' '){
				spaceCount++;
			}
		}
		
		int nLength= src.length()+3*spaceCount;
		
		char[] newStr= new char[nLength];
		int ori=0;
		
		for(int i=0; i< newStr.length;i++){
			if(str[ori]==' '){
				newStr[i]='%';
				newStr[i+1]='2';
				newStr[i+2]='0';
				i=i+3;
				ori++;
			}else{
				newStr[i]=str[ori];
				ori++;
			}
		}
		
		System.out.println(new String(newStr));
		
	}

}
