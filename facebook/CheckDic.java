package facebook;

import java.util.HashSet;

public class CheckDic {

	
	public static boolean checkDic(String[] dic, String key){
		 boolean res= false;
		 
		 if(key.length()==0){
			 res= true;
		 }
		 
		 HashSet<String> set = new HashSet<String>();
		 
		 for(int i=0; i<dic.length;i++){
			 set.add(dic[i]);
		 }
		 
		 for(int k=0; k<key.length()-1;k++){
			 String subword = key.substring(0,k+1);
			 if(set.contains(subword)){
				 res= checkDic(dic, key.substring(k+1));
			 }
		 }
		 
		 
		 return res;
	}
}
