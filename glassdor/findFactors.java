package glassdor;

public class findFactors {
	
	public static void main(String args[]){
		
		
		int factor=98;
		int i=1;
		
		while(i <= factor){
			
			if(factor%i == 0){
				System.out.println(i +" is a factor");
				
			}
			i++;
		}
	}

}
