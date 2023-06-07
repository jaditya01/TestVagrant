package String_Prepration;


//How to reverse the words in a given String sentence? 


public class Reverse_words_String {

	public static void main(String[] args) {
		String s = "Java is Best";
		
		String rev ="";
		String ad[] =s.split(" ");
		
		for(int i=0;i<ad.length;i++) {
			rev = ad[i]+" "+rev ;
			
		}
		System.out.println(rev);
	}

}
