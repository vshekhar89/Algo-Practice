package general;
//convert a binary number in to decimal equivalent
public class BinaryToDec {
	
	public static void binaryToDec(int src){
		
		int rem=10;
		int div=1;
		double pow=0;
		double a=2.0;
		double temp= (src%rem)/div;
		String bin= String.valueOf(src);
		
		for(int i=0; i<bin.length()-1;i++){
			pow++;
			rem=rem*10;
			div=div*10;
			temp=temp+ ((src%rem)/div)*Math.pow(a, pow);
		}
		
		System.out.println(temp);
		
		
		
	}
	
	public static void main(String args[]){
		binaryToDec(011101101);
	}

}
