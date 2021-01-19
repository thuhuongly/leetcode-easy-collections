class Solution {
	public boolean isPalindrome(String s) {
		if (s.isEmpty())
			return true;
		String strip = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		String reverse = new StringBuffer(strip).reverse().toString();
		return strip.equals(reverse);
	}
}