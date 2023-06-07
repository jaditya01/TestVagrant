package Testvagrant.Helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

import org.apache.commons.lang3.ArrayUtils;

public class Test3_Array {

	public static void main(String[] args) {
		int a[]= {2,5,7,8,7,5,1,2,3,4};
		int b=0;
		
	
		
///////////////////////////////////////////////////////////////////////////////		
	for(int i=0;i<a.length;i++) {
		if(a[i]==1) {
			a[i]=a[i+1];
		}
		
	}
	 Integer p[] = ArrayUtils.toObject(a);
	
	 ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(p));
		System.out.print(al);
		
		
/////////////////////////////////////////////////////////////////////////////		
		
		Integer ab[]= ArrayUtils.toObject(a);
		
		TreeSet<Integer> ts = new TreeSet<Integer>(Arrays.asList(ab));
		
	//	System.out.println(ts);
/////////////////////////////////////////////////
		
		/*
		 * for(int i=0;i<s.length;i++) { b =b+s[i];
		 * 
		 * } System.out.println(b);
		 */
	}

}
