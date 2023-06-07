package String_Prepration;
import java.util.HashMap;
import java.util.Map;

public class max_count {

	public static void main(String[] args) {
		   String s = "javavvvvvvaannss";
	        
	      int m_count=0;
	  	int count=0;
	  	char  m_char = 0;
	    for(int i=0;i<s.length();i++) {
	       count=0;
	    	for(int j=0;j<s.length();j++) {
	    		if(s.charAt(i)==s.charAt(j)) {
	    			count++;
		    		
	    	}
	    		if(m_count<count) {
	    			m_count=count;
	    			m_char=s.charAt(i);
	    		}
	    	}
	    	
	    }
		   System.out.println(m_char+" "+m_count);
	    }

}	


