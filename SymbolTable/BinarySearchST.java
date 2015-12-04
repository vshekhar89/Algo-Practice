package SymbolTable;

public class BinarySearchST<Key extends Comparable<Key>, Value> {
	
	private Key[] keys;
	private Value[] values;
	private int N;
	
	public BinarySearchST(int capacity){
		keys= (Key[]) new Comparable[capacity];
		values= (Value[]) new Object[capacity];
		N = capacity;
	}
	
	public int rank(Key key){
		if(keys.length==0) {
			System.out.println("No Keys");
			return 0;
		}
		int lo=0;
		int hi= N-1;
		
		while(lo<=hi){
			int mid= lo + (hi-lo)/2;
			int cmp= key.compareTo(keys[mid]);
			if(cmp < 1)hi= hi-mid;
			else if(cmp > 1)lo= lo+mid;
			else return mid;
		}
		return lo;
	}
	
	public Value get(Key key){
		int i = rank(key);
		
		if(i < N && keys[i].compareTo(key)==0){
			return values[i];
		}
		return null;
	}
	
	public void put(Key key, Value val){
		int i = rank(key);
		
		if(i< N && keys[i].compareTo(key)==0 ){
			values[i]= val;
			return;
		}else{
			for(int j=N; j>i;j--){
				keys[j]= keys[j-1];
				values[j]= values[j-1];
			}
			keys[i]= key;
			values[i]= val;
			N++;
		}
		
	}
	
	
}
