
public class QuickSort {

	public static int partition(int arr[], int left, int right)
	{
		System.out.println("New Partition");
		System.out.println("form "+ arr[left]+" to "+ arr[right]);
	      int i = left, j = right;
	      
	      int tmp;
	      int pivot = arr[(left + right) / 2];
	     
	      while (i <= j) {
	            while (arr[i] < pivot)
	                  i++;
	            while (arr[j] > pivot)
	                  j--;
	            if (i <= j) {
	            	System.out.println("pivot is  "+pivot);
	            	System.out.println("Swapping: "+ arr[i]+ "and "+ arr[j]);
	                  tmp = arr[i];
	                  arr[i] = arr[j];
	                  arr[j] = tmp;
	                  i++;
	                  j--;
	            }
	      };
	     
	      return i;
	}
	 
	public static void  quickSort(int arr[], int left, int right) {
	      int index = partition(arr, left, right);
	      if (left < index - 1)
	            quickSort(arr, left, index - 1);
	      if (index < right)
	            quickSort(arr, index, right);
	      
	      }
	
	
	
	public static void main(String args[]){
		
		int[] item ={3,5,2,1,6,-7,4,9,10,45,32,0};
		
		quickSort(item, 0, item.length-1);
		 
	      System.out.println("Sorted Array");
	      for(int k=0;k<item.length-1;k++){
	    	  System.out.println(item[k]);
	}
}
}