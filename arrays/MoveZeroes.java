class Solution {
	public void moveZeroes(int[] nums) {
		for (int cur = 0; cur < nums.length; cur++) {
			for (int lastNonZeroFoundAt = cur + 1; lastNonZeroFoundAt < nums.length; lastNonZeroFoundAt++) {
				if (nums[cur] == 0) {
					int tmp = nums[lastNonZeroFoundAt];
					nums[lastNonZeroFoundAt] = nums[cur];
					nums[cur] = tmp;
				}
			}
		}
	}
}