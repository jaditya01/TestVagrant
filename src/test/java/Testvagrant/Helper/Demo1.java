package Testvagrant.Helper;

import java.util.StringTokenizer;

public class Demo1 {

	public static void main(String[] args) {

		//String s="Test89Java65python89apple";
		
		String s="Test!@#$%Java#$python$%apple";
		
	//	Output : tset89avaj65nothyp89elppa
		
		
	//	tsetavajnothypelppa
	
	//String p = s.replaceAll("[0-9]","  ");
	
	
	String p = s.replaceAll("[!@#$%]","");
		
	System.out.println(p);
		
}
}

