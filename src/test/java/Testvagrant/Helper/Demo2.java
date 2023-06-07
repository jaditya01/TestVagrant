package Testvagrant.Helper;

import java.util.HashMap;
import java.util.Map;

public class Demo2 {

	public static void main(String[] args) {
		String s="aaabbbbccd";
		
		
	
	Map<Character, Integer> mp = new HashMap<Character, Integer>();
	
	for(int i=0;i<s.length();i++) {
	if(mp.containsKey(s.charAt(i))) {
		int count = mp.get(s.charAt(i));
		mp.put(s.charAt(i), ++count);
		
	}
	else {
		mp.put(s.charAt(i), 1);
	}
	
	}
	System.out.println(mp);
	}
	

}
