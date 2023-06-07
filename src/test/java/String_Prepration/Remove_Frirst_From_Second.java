package String_Prepration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.ArrayUtils;

//How to remove characters from the first String which are present in the second String


public class Remove_Frirst_From_Second {

	public static void main(String[] args) {
		
		String s1= "abcd";
		
		String s2= "abghj";
		
		char[] c = s2.toCharArray(); 
		

		List<Character> dt = new ArrayList<Character>();
		
		Set<Character> st = new HashSet<Character>();
		
		/*for(int i=0;i<s2.length();i++) {
			st.add(s2.charAt(i));
		}*/
		
		for(Character asd :c) {
			st.add(asd);
		}
		for(int j=0;j<s1.length();j++) {
		 if(!st.contains(s1.charAt(j))) {
			 dt.add(s1.charAt(j));
			
		 } 
		 
		 }
		System.out.println(dt);

	} 
	

}
