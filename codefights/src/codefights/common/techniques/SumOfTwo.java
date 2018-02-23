package codefights.common.techniques;

import java.util.Arrays;

public class SumOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3};
		int[] b = {10,20,30,40};
		int v = 50;
		
		SumOfTwo s = new SumOfTwo();
		System.out.println(s.sumOfTwo(a, b, v));

	}
	
	boolean sumOfTwo(int[] a, int[] b, int v) {
		
		boolean returnVal = false;
		
		Arrays.sort(a);
		Arrays.sort(b);

		int indxA = 0;
		int indxB = b.length-1;
		while (!returnVal) {
			if ( indxA > (a.length -1) || indxB < 0) {
				break;
			}
			
			if ( v > (a[indxA] + b[indxB]) ) {
				//v is greater so move a one to the right
				indxA++;
			} else if ( v < (a[indxA] + b[indxB]) ) {
				indxB--;
			} else {
				//equals
				returnVal = true;
			}
		}

		
		return returnVal;
	}
}
