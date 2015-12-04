package searching;

public class searchString {
	
	public static void searchString(String[] array, String str, int first, int last){
		
		int mid=(first+ last)/2;
		
		
		if(last<first){
			System.out.println("Error");
		}
		if(array[mid].isEmpty()){
			int left= mid-1;
			int right= mid+1;
			
			while(true){
				if(left < first && right > last){
					//System.out.println("Error");
				}
				else if (right <=last && !array[right].isEmpty()){
					mid= right;
					break;
				}
				else if(left>= first && !array[left].isEmpty()){
					mid=left;
					break;
				}
				
				right++;
				left--;
			}
		}
		
		if(str.equals(array[mid])){
			System.out.println("Success: Found element at postition: "+ mid);
		}
		else if(array[mid].compareTo(str)<0){
			searchString(array, str, mid+1, last);
		}
		else{
			searchString(array, str, first, mid-1);
		}
		
	}
	
	public static void search(String[] string, String str){
		if(string==null || str==null || str==""){
			System.out.println("Eroor, Null String");
		}
		searchString(string, str, 0, string.length-1);
	}

	
	public static void main(String args[]){
		String[] array={"shekhar", "", "indiana","IUB","","vimalendu","first","third","","next"};
		
		search(array, "IUB");
	}
}
