class Solution {
	public int[] twoSum(int[] nums, int target) {
		int[] sum = new int[] { 0, 1 };
		if (nums.length == 2)
			return sum;

		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					sum[0] = i;
					sum[1] = j;
					break;
				}
			}
		}
		return sum;
	}
}