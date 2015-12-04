package glassdor;

public class binaryPlain {

	public static void main(String args[]){
		
		int x=1011;
		int y =1000;
		//System.out.println(x % y);
		int n =-1001;
		boolean ans= isPalindrome(n);
		System.out.println(ans);
		
	}
	
	public static boolean isPalindrome(int x) {
		 // if (x < 0) return false;
		  int div = 1;
		  while (x / div >= 10) {
		    div *= 10;
		  }        
		  while (x != 0) {
		    int l = x / div;
		    int r = x % 10;
		    if (l != r) return false;
		    x = (x % div) / 10;
		    div /= 100;
		  }
		  return true;
		}

}

