
public class isPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="GOD";
		String s2="DOGfff";
		
		char[] c1 =s1.toCharArray();
		char[] c2= s2.toCharArray();
		
		java.util.Arrays.sort(c1);
		java.util.Arrays.sort(c2);
		
		String s3= new String(c1);
		
		String s4= new String(c2);
		
		
		if(s1.length()!= s2.length()){
			System.out.println("Error");
		}
		
		if(s3.equals(s4)){
			System.out.println("Success");
		}
	}

}
