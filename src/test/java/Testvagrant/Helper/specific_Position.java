package Testvagrant.Helper;

import java.util.ArrayList;
import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class specific_Position {

	public static void main(String[] args) {
		int a[]= {2,5,7,8,7,5,1,2,3,4};
		
		
		//a[3]=9;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==7) {
				a[i]=9;
			}
			
			
		}
		
		Integer as[]= ArrayUtils.toObject(a);
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(as));
		System.out.println(al);

	}

}
