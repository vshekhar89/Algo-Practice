
public class charCount {

	
	public static void main(String args[]){
		String st="aaaaabbbbbcccc";
		//char[] stc = st.toCharArray();
		String mystr="";
		char last=st.charAt(0);
		int count=1;
		for(int i =1; i<st.length();i++){
			if(st.charAt(i)==last){
				count++;
			}
			else{
				mystr=mystr+last+count;
				count=1;
				last=st.charAt(i);
			}
		}
		System.out.println(mystr+last+count);
		
	}
}
