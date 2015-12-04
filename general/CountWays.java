package general;

public class CountWays {

	
//	public static Integer countWays(int n){
//		
//		if(n==0){
//			return 0;
//		}if(n==1){
//			return 1;
//		}else{
//			return countWays(n-1)+ countWays(n-2)+countWays(n-3);
//		}
//	
//	}
//	
	public static Integer countWays(int n, int[] map){
		if(n < 0){
			return 0;
		}else if(n==0){
			return 1;
		}else if(map[n]>-1){
			return map[n];
		}else{
			map[n]=countWays(n-1,map)+
					countWays(n-2,map)+
					countWays(n-3, map);
			return map[n];
		}
	}
	
	
	public static void main(String args[]){
		
		int steps=1;
		int[] map= new int[10];
		int ways = countWays(steps ,map);
		System.out.println(ways);
		
	}
}
