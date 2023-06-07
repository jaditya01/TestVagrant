package String_Prepration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class max_count_map {

	public static void main(String[] args) {
 
		String s ="aa bb cccc bbb         aaaaaaa";
		
		s= s.replaceAll(" ", "");
		
		int max=0;
		char keymax=0;
		Map<Character, Integer> mp = new HashMap<Character, Integer>();
		
		for(int i=0;i<s.length();i++) {
			
			if(mp.containsKey(s.charAt(i))) {
				int count = mp.get(s.charAt(i));
				mp.put(s.charAt(i), ++count);
				
			} else {
				mp.put(s.charAt(i), 1);
			}
			
		}
		
		mp.remove(" ");
		for(Map.Entry<Character, Integer> ac : mp.entrySet()) {
			
			int countmax = ac.getValue(); 
			if(max < countmax) {
				max=countmax;
				keymax =ac.getKey();
			}
		}
		System.out.println(keymax+" "+max);
	
		

 }
}