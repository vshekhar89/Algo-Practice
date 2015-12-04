import java.util.Scanner;


public class ReadInput {
	
	public static void main(String args[]){
		System.out.println("Enter Information");
		Scanner sc= new Scanner(System.in);
		
		int numbr= sc.nextInt();
		//System.out.println(numbr);
		int[] arr= new int[numbr];
		//sc.nextLine();
		
		for(int i=0; i<numbr;i++){
			arr[i]=sc.nextInt();
		}
		
		for(int k=0;k<numbr;k++){
			System.out.println(arr[k]);
		}
	}

}
