package codefights.common.techniques;

import java.util.HashMap;

public class SumInRange {

	public static void main(String[] args) {

		
		int[] nums = {3,0,-2,6,-3,2};
		int[][] queries = 
				{
						{0,2},
						{2,5},
						{0,5}
				};
		SumInRange s = new SumInRange();
		System.out.println(s.sumInRange(nums, queries));

	}
	
	int sumInRange(int[] nums, int[][] queries) {
	     if(nums.length==0 || queries.length==0) return 0;
	     int mod= 1000000007;
	     HashMap<Integer,Integer> map = new HashMap<>();
	     int sumPre = nums[0];
	     map.put(0,sumPre);
	     for(int i= 1; i< nums.length;i++){
	          sumPre= sumPre+nums[i];
	          System.out.println(sumPre);
	          map.put(i,sumPre%mod);
	     }   
	     int sum=0;
	     for(int i = 0; i< queries.length;i++){
	         if(queries[i][0]==0) 
	              sum = sum%mod +  map.get(queries[i][1])%mod;
	         else 
	              sum = sum%mod + map.get(queries[i][1])- map.get(queries[i][0]-1)%mod;      
	     }
	     return (sum+ mod)%mod;
	}	
}
