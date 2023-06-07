package String_Prepration;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class NoN_Repeating {

	public static void main(String[] args) {

		String s = "ararushi";

		
		  
		/*
		 * for (int j = 0; j < s.length(); j++) { String sub=s.substring(j+1,
		 * s.length()); System.out.println(sub);
		 * 
		 * String sp=String.valueOf(s.charAt(j)); System.out.println(sp);
		 * if(sub.contains(sp)) { continue; } else { System.out.println(s.charAt(j));
		 * break; } }
		 */
		
		
		Map<Character, Integer> mp = new LinkedHashMap<Character, Integer>();
		
		for(int i=0;i<s.length();i++) {
			if(mp.containsKey(s.charAt(i))) {
				int count  = mp.get(s.charAt(i));
				mp.put(s.charAt(i), ++count);
			} else {
				mp.put(s.charAt(i), 1);
			}
		}
	System.out.println(mp);
		   for (Map.Entry<Character, Integer> am : mp.entrySet()) {
			   int val= am.getValue();
			   Character c= am.getKey();
			   if(val==1) {
				   System.out.println(c+" "+val);
				   break;
			   }
		   }
		
			}
		}
		
