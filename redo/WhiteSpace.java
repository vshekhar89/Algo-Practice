package redo;

public class WhiteSpace {
	
	public static void main(String args[]){
		String src="This is the original string";
		
		char[] srcarr= src.toCharArray();
		char[] newstr= new char[srcarr.length*10];
		int origi=0;
		
		for(int i =0; i<newstr.length;i++){
			if(srcarr[origi]==' '){
				newstr[i]='%';
				newstr[i+1]='2';
				newstr[i+2]='0';
				i=i+3;
				origi++;
			}else{
				newstr[i]=srcarr[origi];
				origi++;
			}
		}
		
		System.out.println(new String(newstr));
		
	}

}
