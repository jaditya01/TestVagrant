package String_Prepration;

//How to check if two strings are rotations of each other


public class Check_Rotation {

	public static void main(String[] args) {
		
		String s1 = "XYZ";
		 String s2 ="ZYX";
		 
		 String rev ="";
		char[] a= s1.toCharArray();
		 for(char d : a) {
			 rev =d+rev;
		 }
		 
		 System.out.println(rev);
		 
          System.out.println(rev.equals(s2));
	}

}
