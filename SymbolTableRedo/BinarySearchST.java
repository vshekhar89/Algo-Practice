package SymbolTableRedo;

public class BinarySearchST<Key extends Comparable<Key>, Value> {
	
	public Key[] keys;
	public Value[] values;
	int N;
	
	public BinarySearchST(int capacity){
		keys = (Key[])new Comparable[capacity];
		values= (Value[]) new Object[capacity];
		N= capacity;
	}
	
	public int rank(Key key){
		int lo=0;
		int high= N-1;
		while(lo <= high){
			int mid= lo+ (high-lo)/2;
			int cmp = key.compareTo(keys[mid]);
			if(cmp < 0)high= high-mid;
			if(cmp > 0)lo= lo+mid;
			else return mid;
		}
		return lo;
	}
	
	public Value get(Key key){
		int i = rank(key);
		if(i < N && key.compareTo(keys[i])==0){
			return values[i];
		}else{
			return null;
		}
	}
	
	public void put(Key key, Value val){
		int i= rank(key);
		if(i < N && keys[i].compareTo(key)==0 ){
			values[i]= val;return;
		}else{
			for(int j=N; j< i; j--){
				values[j]= values[j-1];
				keys[j]= keys[j-1];
			}
			keys[i]= key;
			values[i]= val;
			N++;
		}
	}
	
	

}
