class Solution {
	public int singleNumber(int[] nums) {
		int uniq = nums[0];
		HashMap<Integer, Integer> map = new HashMap<>();
		if (nums.length == 1) {
			return uniq;
		}
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue().equals(1)) {
				return entry.getKey();
			}
		}
		return uniq;
	}
}