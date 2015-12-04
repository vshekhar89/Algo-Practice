import java.lang.reflect.Array;


public class magicIndex {

	
	public static int magicIndex(int[] array,int start,int end){
		if(end<start || start<0 || Array.getLength(array)==0){
			return 0;
		}
		
		int mid= (start+ end)/2;
		
		if(mid==array[mid]){
			return mid;
		}
		
			int leftindex= Math.min(mid-1, array[mid]);
			int left=magicIndex(array, start,leftindex);
			if(left>0){
				return left;
			}
					
		
			int rightindex= Math.min(mid, array[mid]);
			int right= magicIndex(array, rightindex, end);
			return right;
		}
}
