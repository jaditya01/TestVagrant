package String_Prepration;

import java.util.Set;
import java.util.TreeSet;

//How to remove all duplicates from a given string?


public class Remove_Duplicate {

	public static void main(String[] args) {
		String s ="aaabbbccddd sss ddd ggg";

	//    s= s.replaceAll(" ", "");
		
		Set<Character>  st = new TreeSet<Character>();
		for(int i=0;i<s.length();i++) {
			st.add(s.charAt(i));
			
		}
		System.out.println(st);

	}

}
