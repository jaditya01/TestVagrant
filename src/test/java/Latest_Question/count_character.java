package Latest_Question;

public class count_character {

	public static void main(String[] args) {
		String s = "AAAABBCCDDDAA";
		int count=1;
	   for(int i=0;i<s.length();i++) {
		   if(s.charAt(i)==s.charAt(i+1)) {
			   count++;
		   } else {
			   break;
		   }
	   }
	   System.out.println(count);

	}

}
