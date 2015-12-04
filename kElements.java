
public class kElements {

	
	public static void main(String args[]){
		
		int[] t= {6,5,8,10,66,33,45,67,34,12};
		
		int k =5;
		int[] temp= new int[k];
		
		
		
		for(int i=0; i<k;i++){
			temp[i]=t[i];
			
		}
		for(int r=0; r<k ;r++){
			System.out.println(temp[r]);
		}
		
		for(int j=0; j<t.length;j++){
			for(int s =0 ;s< temp.length;s++){
				if(t[j] > temp[s]){
					System.out.println("replacing "+temp[s]+ " with "+t[j]);
					temp[s]= t[j];
					
				break;	
				}
				
			}
		}
		
		for(int r=0; r<k ;r++){
			System.out.println(temp[r]);
		}
	}
}
