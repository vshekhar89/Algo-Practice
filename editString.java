
public class editString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String org="This is a test string";
		char[] st =org.toCharArray();
		
		//char[] org1='This is a test string';
		
		int spcount=0;
		
		for(int i=0; i<org.length();i++){
			if(st[i]==' '){
				spcount++;
			}
		}
		
		int newlength = org.length() + spcount * 2;
		st[newlength-1]='\0';
		for(int i=org.length()-1;i>=0;i--){
			if(st[i]==' '){
				st[newlength-1]='0';
				st[newlength-2]='2';
				st[newlength-3]='3';
				newlength= newlength-3;
				
			}
			else{
				st[newlength-1]=st[i];
				newlength=newlength-1;
			}
		}
		
		System.out.println(st);
		
	}

}
