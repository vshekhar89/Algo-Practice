import Trees.size;


public class binarytodec {

	
	public static void bintodec(int n){
		
		int rem=10;
		int div=1;
		double temp=(n%rem)/div;
		double a=2;
		double b=1;
		String bin= String.valueOf(n);
		//System.out.println(temp);
		for(int i=0; i < bin.length();i++){
			div= div*10;
			rem=rem*10;
			temp= temp+ ((n%rem)/div)*(Math.pow(a,b));
			b++;
			System.out.println(temp);
			
		}
		System.out.println(temp);
	
			}
		
	public static void main(String args[]){
		int n=011101101;
		bintodec(n);
		//System.out.println((n%10)/1);
	}
}
