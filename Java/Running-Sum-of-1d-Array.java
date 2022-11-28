// Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

// Return the running sum of nums.
import java.util.*;

class Solution {
	public int[] runningSum(int[] nums) {
		int size = nums.length;
		int output[] = new int[size]; // Initialize array
		int current = 0;

		for (int i = 0; i < nums.length; i++) {
			current = current + nums[i];
			System.out.println(current);
			output[i] = current;
		}
		return output;

	}
}