package careerCup;

import java.util.HashMap;
import java.util.List;

public class EmailList {
	
	public List<String> emailids(List<List<String>> emailist){
		List<String> ids = null;
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		for(List<String> emails : emailist){
			for(String email: emails){
				if(hm.get(emails)!=null){
					hm.put(email, hm.get(emails)+1);
				}
				else{
					hm.put(email, 1);
				}
			}
			
		}
		for(String resemails: hm.keySet()){
			if(hm.get(resemails)==emailist.size()){
				ids.add(resemails);
			}
		}
		
	
		return ids;
	}

}
