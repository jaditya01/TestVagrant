package String_Prepration;

public class Number_Words_String {

	public static void main(String[] args) {
		
		String s ="java is Great";
		int count=0;
		String[] p =s.split(" ");
		
		for(String ps :p) {
			count++;
		}

		System.out.println(count);
	}

}
