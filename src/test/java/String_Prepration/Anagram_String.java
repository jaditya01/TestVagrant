package String_Prepration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//How to check if two given String is the anagram of each other?


//for example, "Army" and "Mary" is the anagram



public class Anagram_String {

	public static void main(String[] args) {
		
		String s ="Aamrmy";
		
		String p="Mamary";
		
		s=s.toLowerCase();
		p= p.toLowerCase();
		
		
		
		Map<Character, Integer> mp1 = new HashMap<Character, Integer>();
		
		Map<Character, Integer> mp2 = new HashMap<Character, Integer>();
		
		for(int i=0;i<s.length();i++) {
		 if(mp1.containsKey(s.charAt(i))) {
			int count1 =  mp1.get(s.charAt(i));
			mp1.put(s.charAt(i), ++count1);

		} else {
			mp1.put(s.charAt(i),1);
		}
		 if(mp2.containsKey(p.charAt(i))) {
				int count2 =  mp2.get(p.charAt(i));
				mp2.put(p.charAt(i), ++count2);

			} else {
				mp2.put(p.charAt(i), 1);
			}
		}

		System.out.println(mp1);
		System.out.println(mp2);
		
		
		
		if(mp1.equals(mp2)){
			
			System.out.println("String is angaram");
		}
		else {
			System.out.println("String is not angaram");
		}

	}

}
	

