
public class mergeSort {

	
	public static void main(String args[]){
		int[] item={2,5,6,3,8,9,10,33,21,435,79,1,5,7,34,78,42,78};
		int low=0;
		int high =item.length-1;
		mergeSort(item, low, high);
		
		for(int i=0;i<high;i++){
			System.out.println(item[i]);
		}
		
	}
	
	public static void mergeSort(int[] item, int low, int high){
		
		
		
		if(low < high){
			
			int mid=(low +high)/2;
			mergeSort(item, low, mid);
			
			mergeSort(item, mid+1 ,high);
			
			merge(item, low, high);
			
			
		}
		
	}
	
	public static int[] merge(int[] item, int low, int high){
		
		int[] list= new int[item.length];
		
		int mid= (low+high)/2;
		int index1=0;
		int index2=low;
		int index3= mid+1;
		
		while(index2 <= mid && index3 <= high ){
			if(item[index2] < item[index3]){
				list[index1]= item[index2];
				index1++;
				index2++;
			}
			else{
				list[index1] = item[index3];
				index1++;
				index3++;
			}
		}
		while(index2 <= mid){
			list[index1]=item[index2];
			index1++;
			index2++;
		}
		
		while(index3 <=high){
			list[index1]= item[index3];
			index1++;
			index3++;
		}
		
		for(int i=low,j=0;i<high; i++,j++){
			item[i]= list[j];
			
		}
		
		return item;
	}
}
