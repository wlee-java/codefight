package codefights.hashtable;

import java.util.HashMap;
import java.util.Map;

public class ContainsCloseNums {

	public static void main (String[] args) {
		
		ContainsCloseNums s = new ContainsCloseNums();
		int[] nums = {1, 0, 1, 1};
		int k = 1;
		System.out.println(s.containsCloseNums(nums, k));

	}
	
	boolean containsCloseNums(int[] nums, int k) {
		boolean returnVal = false;
		//Key is number, value is first seen
		Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
		
		for (int i=0;i<nums.length;i++) {
			
			//if it doesnt exist in map put in map.
			//if it exist in map compare the current position to what was stored
			if (myMap.containsKey(nums[i])) {
				if ((i - myMap.get(nums[i]) ) <= k ) {
//					System.out.println("for key: " + nums[i] + " First instance: " + myMap.get(nums[i]) + " Current Location: " + i);
					returnVal = true;
					break;	
				}
			}
			myMap.put(nums[i], i);
		}
		
		//find all the distances between two same values?
		return returnVal;
	}
}
