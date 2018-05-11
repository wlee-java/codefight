package codefights.hashtable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 * You have a collection of coins, and you know the values of the coins and the
 * quantity of each type of coin in it. You want to know how many distinct sums
 * you can make from non-empty groupings of these coins.
 * 
 * @author won
 *
 */
public class PossibleSums {

	public static void main(String[] args) {
		int[] coins = { 10, 50, 100 };
		int[] quantity = { 1, 2, 1 };
		PossibleSums s = new PossibleSums();

		System.out.println(s.possibleSums(coins, quantity));
	}

	int possibleSums(int[] coins, int[] quantity) {
		Set<Integer> sums = new HashSet<Integer>();
		sums.add(0);
		for (int i = 0; i < quantity.length; ++i) {
			List<Integer> sumsNow = new ArrayList<Integer>(sums);
			for (Integer sum : sumsNow) {
				for (int j = 1; j <= quantity[i]; ++j) {
					sums.add(sum + j * coins[i]);
				}
			}
		}
		return sums.size() - 1;
	}

}
