package class_07;
/*
 https://leetcode.com/problems/sqrtx/description/
*/

public class Sqrtx {
	public int mySqrt(int x) {
		if (x <= 0)
			return 0;
		int l = 1, r = x, res = 1;
		while (l < r) {
			int mid = (l + r) / 2;
			if (mid > x / mid) {
				r = mid;
			} else {
				res = mid;
				l = mid + 1;
			}
		}
		return res;
	}
}
