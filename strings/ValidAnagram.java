class Solution {
	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length())
			return false;
		char[] sarray = s.toCharArray();
		char[] tarray = t.toCharArray();
		Arrays.sort(sarray);
		Arrays.sort(tarray);
		if (Arrays.equals(sarray, tarray)) {
			return true;
		}
		return false;
	}
}