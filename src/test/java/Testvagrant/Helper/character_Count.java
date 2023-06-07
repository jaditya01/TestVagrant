package Testvagrant.Helper;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class character_Count {

	public static void main(String[] args) {
	 String s = "aaabbccd";
	
	 Map<Character, Integer> mp = new HashMap<Character, Integer>();
	 
	 for(int i=0;i<s.length();i++) {
	
		 if(mp.containsKey(s.charAt(i))) {
		 int count = mp.get(s.charAt(i));
			 mp.put(s.charAt(i), ++count);
			 
		 } else {
		 mp.put(s.charAt(i), 1);
		 }
	 }
	 
//	 for(Entry<Character, Integer> m: mp.entrySet()) {
	 System.out.println(mp);
//	 if(m.getKey()=='a') {
	//	 System.out.println("word is avliable ");
//	 }
	
	
//	 }

	}

}
