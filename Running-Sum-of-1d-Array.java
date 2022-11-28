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