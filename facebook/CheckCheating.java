package facebook;

public class CheckCheating {

	
	public static boolean hasCheated(String s1, String s2, int N){
		boolean res=false;
		
		
		for(int i=0; i<=s1.length()/N; i++){
			String subword = s1.substring(i,i+N-1);
			if(s2.contains(subword)){
				res= true;
			}
		}
		
		
		
		return res;
	}
}
