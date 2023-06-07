package Testvagrant.Helper;

import java.util.Arrays;

public class Sort_array {

	public static void main(String[] args) {
		
		int a[]= {2,5,7,8,7,5,1,2,3,4};
		
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		
		int len = a.length;
				
		System.out.println(a[len-2]);
		
	}

}
