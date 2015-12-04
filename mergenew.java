
public class mergenew {
	

	public static void main(String args[]){
		int[] item={2,5,6,3,8,9,10,33,21,435,79,1,5,7,34,78,42,78};
		int low=0;
		int high =item.length-1;
		mergeSort(item, low, high);
		
		for(int i=0;i<high;i++){
			System.out.println(item[i]);
		}
		
	}
	
	public static void mergeSort(int[] list, int low, int high) {
		if (low < high) {
		// find the midpoint of the current array
		int mid = (low + high)/2;
		// sort the first half
		mergeSort(list,low,mid);
		// sort the second half
		mergeSort(list,mid+1,high);
		// merge the halves
		merge(list,low,high);
		}
		}

	public static void merge(int[] list, int low, int high) {
		// temporary array stores the ‘‘merge’’ array within the method
	int[] temp = new int[list.length];
	// Set the midpoint and the end points for each of the subarrays
	int mid = (low + high)/2;
	int index1 = 0;
	int index2 = low;
	int index3 = mid + 1;
	// Go through the two subarrays and compare, item by item,
	// placing the items in the proper order in the new array
	while (index2 <= mid && index3 <= high) {
	if (list[index2] < list[index3]) {
	temp[index1] = list[index2];
	index1++;
	index2++;
	}
	else {
	temp[index1] = list[index3];
	index1++;
	index3++;
	}
	}
	// if there are any items left over in the first subarray, add them to
	// the new array
	while (index2 <= mid) {
	temp[index1] = list[index2];
	index1++;
	index2++;
	}
	// if there are any items left over in the second subarray, add them
	// to the new array
	while (index3 <= high) {
	temp[index1] = list[index3];
	index1++;
	index3++;
	}
	// load temp array’s contents back into original array
	for (int i=low, j=0; i<=high; i++, j++) {
	list[i] = temp[j];
	}
	}
}
