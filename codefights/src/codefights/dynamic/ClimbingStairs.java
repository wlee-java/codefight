package codefights.dynamic;

public class ClimbingStairs {

	public static void main(String[] args) {

		ClimbingStairs s = new ClimbingStairs();
		System.out.println(s.climbingStairs(3));
		System.out.println("Do nothing");


	}

	int climbingStairs(int n) {
		if (n <= 2)
			return n;
		int[] num = new int[n];
		num[0] = 1;
		num[1] = 2;
		for (int i = 2; i < n; i++) {
			num[i] = num[i - 1] + num[i - 2];
		}
		return num[n - 1];
	}

}
