package Testvagrant.Helper;

import java.util.HashMap;
import java.util.Map;

public class Number_Count {

	public static void main(String[] args) {
		
		int a[] = {1,6,2,1,2,3,2,1,2,3,1};

		int count =0;
		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
		for(int i =0;i<a.length;i++) {
			if(mp.containsKey(a[i])) {
				 count = mp.get(a[i]);
				 mp.put(a[i],++count);
			}
			else {
				mp.put(a[i], 1);
			}
			
		}
		System.out.println(mp);
	}

}
