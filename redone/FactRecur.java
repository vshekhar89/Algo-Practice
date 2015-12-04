package redone;

public class FactRecur {

	
	public static int fact(int number){
		
		int fact=number;
		int n= number;
		for(int i=0;i<n-1;i++){
			number--;
			fact = fact*number;
			System.out.println(fact);
			}
		
		return fact;
	}
	
	public static void main(String args[]){
		int fact = fact(10);
		
		System.out.println(fact);
	}
}
