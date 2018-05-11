package codefights.array;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicate {

	public static void main(String[] args) {

		int[] a = { 2, 3, 3, 1, 5, 2 };
		FirstDuplicate s = new FirstDuplicate();
		System.out.println(s.firstDuplicate(a));
		
	}

	int firstDuplicate(int[] a) {
		Set<Integer> foundIt = new HashSet<Integer>();
		int returnVal = -1;
		for (int i = 0; i < a.length; i++) {
			if (foundIt.contains(a[i])) {
				returnVal = a[i];
				break;
			} else {
				foundIt.add(a[i]);
			}
		}
		return returnVal;
	}

}
