package glassdor;

public class thirdHighest {

	
	public static void main(String args[]){
		
		int[] b={2,6,3,8,3,9,10,4,15,32};
		
		int highest= Integer.MIN_VALUE+2;
		int sec_highest= Integer.MIN_VALUE+1;
		int thr_highest=Integer.MIN_VALUE;
		
		for(int i : b){
			if(i > highest){
				thr_highest= sec_highest;
				sec_highest= highest;
				highest=i;
			}
			else if(i< highest && i> sec_highest){
				thr_highest= sec_highest;
				sec_highest= i;
			}
			else if(i>thr_highest && i<sec_highest){
				thr_highest=i;
			}
		}
		System.out.println("highest: "+highest);
		System.out.println("se_highest: "+ sec_highest);
		System.out.println("thr_highest "+ thr_highest);
	}
}
