package Testvagrant.Helper;

public class Reverse_String {

	public static void main(String[] args) {
	//	Original string : how to do in java
	//	Reversed string : woh ot od ni avaj 
		
		
		String s="how to do in java";
		
		//String s="how32to32do54in87java";
		
	
	    String as[]= s.split("\\s");
        String revline="";
        
        for(int i=0;i<as.length;i++){
        String 	word=  as[i];
       // System.out.println(word);
        String rev="";
          for(int j=word.length()-1;j>=0;j--) {
        	  rev =rev+word.charAt(j);
        	  
          }
        
        revline = revline+rev +" ";
     
        	}
       System.out.println(revline);
        }
	 
}
