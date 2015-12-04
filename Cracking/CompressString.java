package Cracking;

public class CompressString {
	
	public static String compress(String src){
		int size= countCompression(src);
		
		if(size > src.length()){
			return src;
		}
		
		char last= src.charAt(0);
		StringBuffer mystr= new StringBuffer();
		int count=0;
		for(int i=0; i<src.length();i++){
			if(src.charAt(i)==last){
				count++;
			}else{
				mystr.append(last);
				mystr.append(count);
				last= src.charAt(i);
				count=1;
				
				
			}
		}
		mystr.append(last);
		mystr.append(count);
		
		return mystr.toString();
	}
	
	public static Integer countCompression(String src){
		if(src.length()==0){
			return 0;
		}
		
		int size=0;
		int count=1;
		char last = src.charAt(0);
		
		for(int i=0; i<src.length();i++){
			if(src.charAt(i)==last){
				count++;
			}else{
				size += 1+ String.valueOf(count).length();
				count=1;
				last=src.charAt(i);
			}
		}
		return size;
	}
	
	public static void main(String args[]){
		String src="aaajjjjfffbbbfunndjjd";
		
		String res= compress(src);
		
		System.out.println(res);
	}

}
