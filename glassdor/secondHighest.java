package glassdor;

public class secondHighest {

	
	public static void main(String args[]){
		int[] b={2,6,3,8,3,9,10,4,15,32};
		
		int highest= Integer.MIN_VALUE+1;
		int sec_highest= Integer.MIN_VALUE;
		
		for(int i : b){
			if(i> highest){
				sec_highest=highest;
				highest= i;
			}
			else if(i> sec_highest && ! (i <= highest)){
				sec_highest=i;
			}
		}
		System.out.println(sec_highest);
	}
}
