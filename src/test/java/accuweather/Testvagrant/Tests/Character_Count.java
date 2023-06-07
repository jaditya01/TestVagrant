package accuweather.Testvagrant.Tests;

import java.util.HashMap;

public class Character_Count {

	public static void main(String[] args) {
		
		String s ="JAVAAAA";
		

		HashMap<Character, Integer> hp = new HashMap<Character, Integer>();
		
		for(int i=0;i<s.length();i++) {
			if(hp.containsKey(s.charAt(i))) {
				int count = hp.get(s.charAt(i));
				hp.put(s.charAt(i), ++count);
			}
			else {
				hp.put(s.charAt(i), 1);
			}
		}
		
		System.out.println(hp);
	}

}
