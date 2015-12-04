
public class UniqueChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "This";
		
		for(int i=0; i<s.length();i++){
			for(int j=0; j<s.length()-1;j++){
				if (s.charAt(j)==s.charAt(j+1)){
					System.out.println("Not unique chars");
					return;
				}
			}
		}
		System.out.println("Unique chars");
	}

}
