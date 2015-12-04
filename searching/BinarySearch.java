package searching;

public class BinarySearch {
	
	public static int binarySearch(int list[], int item){
		int index=-1;
		int low=0;
		int high=list.length-1;
		int mid;
		
		while(high>=low){
			mid=(low +high+1)/2;
			if(list[mid]==item){
				System.out.println("Item Found");
				index=mid;
				return index;
			}
			if(list[mid]>item){
				high=mid-1;
			}
			else{
				low=mid+1;
			}
		}
		
		return index;
	}
	
	public static void main(String args[]){
		
		int[] item={1,2,3,4,5,6,7,8,9,10};
		System.out.println(item.length);
		for(int i=0;i<item.length;i++){
			System.out.print(item[i]+"\t");
		}
		int res=binarySearch(item,4);
		
		if(res>-1){
			System.out.println("Element found at Position: "+ res);
		}
		else{
			System.out.println("Element Not Found");
		}
		
	}

}
