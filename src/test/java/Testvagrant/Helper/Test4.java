package Testvagrant.Helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.lang3.ArrayUtils;

public class Test4 {

	public static void main(String[] args) {

		int a[] = {4,7,9,5,4,1,2,3,4,0,7,5};
		int b[]= {6,3,8,4,0,5,7,1};
		
		Integer ab[] = ArrayUtils.toObject(a);
		
		Integer ac[]= ArrayUtils.toObject(b);
		
		Set<Integer> st = new TreeSet<Integer>(Arrays.asList(ab));
		
		//ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(ab));
		
		ArrayList<Integer> pl= new ArrayList<Integer>(Arrays.asList(ac));
		
		//al.addAll(pl);
		
		
		st.addAll(pl);
	//	al.removeAll(pl);
		
		System.out.println(st);
		
		
		
		

	}

}
