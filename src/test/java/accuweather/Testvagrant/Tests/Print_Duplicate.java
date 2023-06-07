package accuweather.Testvagrant.Tests;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;import Testvagrant.Helper.character_Count;

//How to print the duplicate characters from the given String



public class Print_Duplicate {

	public static void main(String[] args) {
	
		String s ="aabbccddefg";
		
		Set<Character>  st = new HashSet<Character>();
		
		Set<Character>  dt = new HashSet<Character>();
		for(int i=0;i<s.length();i++) {
			if(!st.add(s.charAt(i))) {
				dt.add(s.charAt(i));
			}
		} System.out.println(dt);
				
 		

	}

}
