package general;

public class NthFibonacci {
	
	public static Integer getNthFibonacci(int n){
		int[] fib = new int[10];
		
		if(n==0){
			return 0;
		}if(n==1){
			return 1;
		}
		if(fib[n]!=0){
			return fib[n];
		}
		
		fib[n]= getNthFibonacci(n-1) + getNthFibonacci(n-2);
		
		return fib[n];
	}
	
	public static void main(String arga[]){
		int n= 6;
		
		int ans= getNthFibonacci(n);
		
		System.out.println(ans);
	}

}
