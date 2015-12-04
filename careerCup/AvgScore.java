package careerCup;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.HashMap;
	import java.util.Map.Entry;

public class AvgScore {
	

	

		public static HashMap<String, Integer> finalScore(ArrayList<testResult> scores){
			HashMap<String,ArrayList<Integer>> scoresList = new HashMap<String,ArrayList<Integer>>();
			for(testResult score:scores){
				if(scoresList.containsKey(score.studentId)){
					scoresList.get(score.studentId).add(score.score);
				}else{
					ArrayList<Integer> marks = new ArrayList<Integer>();
					marks.add(score.score);
					scoresList.put(score.studentId, marks);
				}
			}
			HashMap<String,Integer> finalScores = new HashMap<String,Integer>();
			for(Entry result:scoresList.entrySet()){
				ArrayList<Integer> mark = (ArrayList<Integer>) result.getValue();
				Collections.sort(mark);
				int finalSc = 0;
				for(int i=mark.size()-1;i>mark.size()-6;i--){
					finalSc += mark.get(i);
				}
				finalScores.put((String) result.getKey(), (finalSc/5));
			}
			return finalScores;
		}
		
		public static void main(String[] args){
			ArrayList<testResult> testResults = new ArrayList<testResult>();
			testResults.add(new testResult(45, "varun", "1"));
			testResults.add(new testResult(40, "vikas", "1"));
			testResults.add(new testResult(35, "sachin", "1"));
			testResults.add(new testResult(20, "praveen", "1"));
			testResults.add(new testResult(15, "nitish", "1"));
			testResults.add(new testResult(56, "varun", "1"));
			testResults.add(new testResult(68, "varun", "1"));
			testResults.add(new testResult(44, "vikas", "1"));
			testResults.add(new testResult(36, "sachin", "1"));
			testResults.add(new testResult(25, "praveen", "1"));
			testResults.add(new testResult(17, "nitish", "1"));
			testResults.add(new testResult(43, "varun", "1"));
			testResults.add(new testResult(42, "varun", "1"));
			testResults.add(new testResult(48, "vikas", "1"));
			testResults.add(new testResult(45, "sachin", "1"));
			testResults.add(new testResult(70, "praveen", "1"));
			testResults.add(new testResult(55, "nitish", "1"));
			testResults.add(new testResult(75, "varun", "1"));
			testResults.add(new testResult(85, "varun", "1"));
			testResults.add(new testResult(30, "vikas", "1"));
			testResults.add(new testResult(35, "sachin", "1"));
			testResults.add(new testResult(10, "praveen", "1"));
			testResults.add(new testResult(65, "nitish", "1"));
			testResults.add(new testResult(75, "varun", "1"));
			testResults.add(new testResult(45, "varun", "1"));
			testResults.add(new testResult(46, "vikas", "1"));
			testResults.add(new testResult(32, "sachin", "1"));
			testResults.add(new testResult(78, "praveen", "1"));
			testResults.add(new testResult(88, "nitish", "1"));
			testResults.add(new testResult(90, "varun", "1"));
			
			System.out.println(finalScore(testResults).toString());	
		}
	}

