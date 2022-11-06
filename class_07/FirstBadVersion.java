package class_07;
/*
 https://leetcode.com/problems/first-bad-version/description/
*/

public class FirstBadVersion {
	public int firstBadVersion(int n) {
		int left = 1, right = n;
		int ans = -1;
		while (left <= right) {
			int mid = left + (right - left) / 2; 
			if (isBadVersion(mid)) {
				ans = mid;
				right = mid - 1;
			} else {
				left = mid + 1; 
			}
		}
		return ans;
	}
	
	private boolean isBadVersion(int mid) {
		return false;
	}
}
