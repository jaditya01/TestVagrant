package Testvagrant.Helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Test2 {

	public static void main(String[] args) {
		int a[] = {1,2,3,4 ,4,5,5};
		int b[]= {6,7,8,9,0,6,7,1};
		
		List<Integer> list = new ArrayList<Integer>();
		
		Collections.addAll(list, Arrays.stream(a).boxed().toArray(Integer[]::new));
		
		Collections.addAll(list, Arrays.stream(b).boxed().toArray(Integer[]::new));
		
		System.out.println(list);
		
		TreeSet<Integer> ts = new TreeSet<Integer>(list);
		System.out.println(ts);
		
	}

}
