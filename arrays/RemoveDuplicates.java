class Solution {
	public int removeDuplicates(int[] nums) {
		int j = 0;

		for (int i = 0; i < nums.length; i++) {
			if (i + 1 < nums.length && nums[i] == nums[i + 1]) {
				continue;
			} else {
				nums[j] = nums[i];
				j++;
			}
		}

		return j;
	}
}