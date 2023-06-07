package Testvagrant.Helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.apache.commons.lang3.ArrayUtils;



public class Test1 {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		int b[]= {6,7,8,9,0};
		
		Integer[] newArray = ArrayUtils.toObject(a);
		
		List ll = new ArrayList(Arrays.asList(newArray));
		
			
		List l2 = new ArrayList(Arrays.asList(b));
	//	ll.addAll(Arrays.asList(b));
				
			//	Object[] c = ll.toArray();
				 
			////	System.out.println(Arrays.asList(c));
			
		System.out.println(ll);		
		Collections.addAll(ll, l2);
		System.out.println(ll);
				
				
		
		  TreeSet<Integer> ts = new TreeSet<>(ll); 
		  
		  //ts.add(a[i]); ts.add(b[i]); 
		  System.out.println(ts);
		 
				
	}
	
	

}
