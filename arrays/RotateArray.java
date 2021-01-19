class Solution {
	public void rotate(int[] nums, int k) {
		int len = nums.length;
		k %= len;
		int temp, previous;
		for (int i = 0; i < k; i++) {
			previous = nums[len - 1];
			for (int j = 0; j < len; j++) {
				temp = nums[j];
				nums[j] = previous;
				previous = temp;
			}
		}
	}
}