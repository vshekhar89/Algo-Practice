package SymbolTable;

public class ComputeGPA <Key, Value>{
	
	public ComputeGPA(){
		System.out.println("Calculate Your GPA");
	}
	
	public static void main(String args[]){
		BinarySearchST<String,String> st = new BinarySearchST<String, String>(11);
		if(st != null){
		st.put("A+", "4.33");
		st.put("A", "4.00");
		st.put("A-", "3.67");
		st.put("B+", "3.33");
		st.put("B", "3.00");
		st.put("B-", "2.67");
		st.put("C+", "2.33");
		st.put("C", "2.00");
		st.put("C-", "1.67");
		st.put("D", "1.00");
		st.put("F", "0.00");
		}
		try{
		System.out.println("Enter the first grade");
		int grade1 = System.in.read();
		System.out.println("Enter the secong grade");
		int grade2= System.in.read();
		System.out.println("Enter the third grade");
		int grade3= System.in.read();
		
		Double gpa1= Double.valueOf(st.get(String.valueOf(grade1)));
		Double gpa2= Double.valueOf(st.get(String.valueOf(grade2)));
		Double gpa3= Double.valueOf(st.get(String.valueOf(grade3)));
		
		Double gpa= (gpa1+gpa2+gpa3)/3;
		
		System.out.println(gpa);
		
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
