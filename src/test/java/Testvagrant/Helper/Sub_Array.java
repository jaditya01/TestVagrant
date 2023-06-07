package Testvagrant.Helper;

import java.util.ArrayList;
import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class Sub_Array {

	public static void main(String[] args) {
		int nums1[] = {1, 2, 3, 0, 4, 6};
		int nums2[] = { 1, 3, 2, 7, 5, 6, 4, 8};

		
		//{0,1,2,3,4,6}
		
		int b[] = Arrays.copyOf(nums1, 6);
		
		Arrays.sort(nums1);
		
		ArrayList al = new ArrayList();
		for(int i=0;i<nums1.length;i++) {
			if(nums1[i]==b[i]) {
				
			}
			else {
				al.add(b[i]);
			}
		}
		System.out.println(al);
		}
		
	}


