package Testvagrant.Helper;

public class Subarray_Sum {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9,10};
		int count=0;
		
		for(int i=0;i<a.length/2;i++) {
		
			for(int j=a.length-1;j>0;j--) {
				if(a[i]+a[j]==10) {
					count++;
					System.out.println("Count "+a[i]+a[j]);
				}
			}
			
		}System.out.println(count);

	}

}
