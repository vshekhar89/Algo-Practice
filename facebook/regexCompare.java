package facebook;

public class regexCompare {

	
	public static boolean compare(String s1, String s2){
		char[] sA= s1.toCharArray();
		char[] sB = s2.toCharArray();
		
		if(sA.length ==0 && sB.length==0){
			return true;
		}else{
			
			if(sA.length>0){
				if(sA[sA.length-1]=='*'){
					return compare(s1.substring(0,sA.length-1), s2) || compare(s1.substring(0,sA.length-2),s2);
				}if(sA[sA.length-1]=='.'){
					return compare(s1.substring(0, sA.length-1),s2) || compare(s1.substring(0,sA.length-1),s2.substring(0,sB.length-1));
				}if(sB.length>0){
					if(sA[sA.length-1]==sB[sB.length-1]){ 
						return compare(s1.substring(0,sA.length-1), s2.substring(0,sB.length-1));}
						else 
							return false;
					}
				}else{
					return false;
			}
		}
		return false;
	}
	public static void main(String args[])
	{

		//char[] sA;
		//char[] sB;
		int iALength;
		int iBLength;
		//sA=new char[7];
		//sB=new char[4];
		//char[] sA={'a','b','*','c','*','d','.'};
		//char[] sB={'a','b','d','g','h'};
		
		String sA="ab*c*d.";
		String sB="abdgf";
		//iALength=sA.length;
		//iBLength=sB.length;
		if(compare(sA,sB))
			System.out.println("match");
		else
			System.out.println("not match");

	
	}
}
