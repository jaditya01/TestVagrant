package String_Prepration;

import org.junit.Test;

public class Find_Number_In_String {

	public static void main(String[] args) {
		String s = "kjaskfdjn342nk";

		//String p =s.replaceAll("[0-9]","");
		String p =s.replaceAll("[a-z]","");

		System.out.println(p);
		/*
		 * int a =Integer.parseInt(p); System.out.println(a+1);
		 */

      
	}

}
