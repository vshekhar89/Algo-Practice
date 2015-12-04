package careerCup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class relations {

	public ArrayList<List<Integer>> printRelated(List<Pair<Integer,Integer>> pairs){
		
		ArrayList<List<Integer>> relations= new ArrayList<List<Integer>>();
		HashMap<Integer, Integer> hm= new HashMap<Integer, Integer>();
		List<Integer> r= null;
		
		for(Pair<Integer, Integer> p: pairs ){
			hm.put((Integer)p.getElement0(), (Integer)p.getElement1());
			
		}
		
		for(Integer key: hm.keySet()){
			
		}
		
		
		
		
		
		
		return relations;
	}
	
}
