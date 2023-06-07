package Testvagrant.Helper;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class Max_Min_Array {

	public static void main(String[] args) {
		int a[]= {2,5,7,8,7,5,1,2,3,4};
		
     int c= a.length;
		Arrays.sort(a);
		
	//	System.out.println(Arrays.toString(a));
		
		int a_max = a[c-1];
		int a_min = a[0];
		
		System.out.println(a_max +" " + a_min);

	}

}
