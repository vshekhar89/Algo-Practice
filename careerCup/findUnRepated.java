package careerCup;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class findUnRepated {

	public String unrep(Iterator<String> it){
		
		String word= null;
		Map<String, Integer> mp = new LinkedHashMap<String, Integer>();
		
		while(it.hasNext()){
			String wd= it.next();
			Integer count = mp.get(wd);
			mp.put(wd, count==null? 1:count+1);
		}
		
		Iterator<String> keys= mp.keySet().iterator();
		while(keys.hasNext()){
			String wd= keys.next();
			if(mp.get(keys.next())==1){
			return 	wd;
			}
			
		}
			return null;
	}
	
}
