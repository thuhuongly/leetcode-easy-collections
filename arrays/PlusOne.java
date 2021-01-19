class Solution {
	public int[] plusOne(int[] digits) {
		int last = digits[digits.length - 1];
		for (int x = digits.length - 1; x >= 0; x--) {
			if (digits[x] < 9) {
				digits[x] = digits[x] + 1;
				break;
			} else {
				digits[x] = 0;
				if (x == 0) {
					int[] newArray = new int[digits.length + 1];
					newArray[0] = 1;
					digits = newArray;
				}
			}
		}
		return digits;
	}
}