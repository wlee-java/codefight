package codefights.edgeofocean;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MakeArrayConsecutive {

	public static void main(String[] args) {

		
		int[] statues = {6,2,3,8};
		MakeArrayConsecutive s = new MakeArrayConsecutive();
		System.out.println(s.makeArrayConsecutive2(statues));

	}
	
	int makeArrayConsecutive2(int[] statues) {
		//i want to sort the statues
		//i want to find the max value in statues
		//is max value same as length -> nothing missing
		//i want to iterate from 1 to max val and find the missing values.
		
		//saw other solutions.  i brute forced this.  should just iterate through the loops
		
		Arrays.sort(statues);
		Set<Integer> setStatues = new HashSet<Integer>();
		int count=0;
		for (int i=0;i<statues.length;i++) {
			setStatues.add(statues[i]);
		}
		System.out.println(statues[statues.length-1]);
		for (int i=statues[0];i<statues[statues.length-1];i++) {
			if (!setStatues.contains(i)) {
				count++;
				System.out.println("count: " + count);
			}
		}
		
		return count;
	}
	

}
