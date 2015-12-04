package facebook;

public class editString {

	public static void edit(String src){
	char[] st = src.toCharArray();
	
	int space=0;
	
	for(int i=0; i<src.length();i++){
		if(st[i]==' '){
			space++;
		}
	}
	int newlen= src.length()+space*3;
	
	char[] res= new char[newlen];
	res[newlen=1]='\0';
	
	for(int j=src.length()-1; j>=0;j--){
		if(src.charAt(j)==' '){
			res[newlen-1]='0';
			res[newlen-2]='2';
			res[newlen-3]='%';
			newlen= newlen-3;
		}else{
			res[newlen]= st[j];
			newlen= newlen-1;
		}
		
	}
	System.out.println(st.toString());
	
	}
	
	public static void main(String args[]){
		String src="This is a test String";
		edit(src);
	}
	
}
