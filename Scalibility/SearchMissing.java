package Scalibility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class SearchMissing {
	
	public static int noofbits = Integer.MAX_VALUE+1;
	
	public static byte[] bitfield= new byte[noofbits/8];
	
	public static void findMissingNumber() throws FileNotFoundException{
		
		
		Scanner in = new Scanner(new FileReader("file.txt"));
		
		while(in.hasNext()){
			int n= in.nextInt();
			
			bitfield[n/8]=1;
		}
		
		for(int i=0; i<bitfield.length;i++){
			for(int j=0; j<8;j++){
				if((bitfield[i] & (1<<j))==0){
					System.out.println((i*8+j));
					return;
				}
			}
		}
	}

}
