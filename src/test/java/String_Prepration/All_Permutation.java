package String_Prepration;

//How to print all permutation of a String



public class All_Permutation {

	public static void main(String[] args) {
		
		String s ="123";
		
		String per="";
		
		String bs="";

		char as[]= s.toCharArray();

		for(int i=0;i<=s.length()-1;i++) {
			System.out.println((bs+s.charAt(i)+bs.substring(0, s.charAt(i))+bs.substring(s.charAt(i+1), s.length())));
		}
	}

}
