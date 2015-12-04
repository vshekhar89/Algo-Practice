
public class countSteps {

	
	public static int main(String args[]){
		int n=10;
		
		int[] ways=null;
		
		if(n<0){
			//System.out.println("Not valid");
			return 0;
		}
		if(n==0){
			//System.out.println("Zero");
			return 1;
		}
		if(ways[n]!= 0){
			return ways[n];
		}
		 ways[n]=main(n-1)+ main(n-2)+ main(n-3);
	
		//int w= countways(n);
		//System.out.println(w);
		
		System.out.println(ways[n]);
		return ways[n];
	}
	
	
	
}
