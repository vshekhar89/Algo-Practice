package careerCup;

import java.util.ArrayList;
import java.util.HashMap;

public class findavg {
	
	
	public static HashMap<String, ArrayList<Integer>> findaverage(ArrayList<testResult> testscores){
		
		HashMap<String, ArrayList<Integer>> hm = new HashMap<String, ArrayList<Integer>>();
		
		for(testResult scores: testscores){
			if(hm.containsKey(scores.studentId)){
				hm.get(scores.studentId).add(scores.score);
			}else{
				ArrayList<Integer> marks = new ArrayList<Integer>();
				marks.add(scores.score);
				hm.put(scores.studentId, marks);
			}
		}
		
		
		
		
		
		return hm;
	}

}
