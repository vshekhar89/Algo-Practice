package redone;

public class BinaryToDec {
	
	public static double binaryToDec(int bin){
		int rem=10;
		int div= 1;
		double a=2;
		double b=1;
		double temp= (bin%rem)/div;
		String inp= String.valueOf(bin);
		
		for(int i=0; i<inp.length();i++){
			rem=rem*10;
			div=div*10;
			temp = temp + ((bin%rem)/div)*(Math.pow(a, b));
			b++;
			
		}
		
		return temp;
	}
	
	public static void main(String args[]){
		int n =011101101;
		
		double res= binaryToDec(n);
		
		System.out.println(res);
	}

}
