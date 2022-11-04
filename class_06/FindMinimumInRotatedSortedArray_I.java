package class_06;
/*
 https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
*/

public class FindMinimumInRotatedSortedArray_I {
	public int findMin(int[] nums) {
		int s = 0;
		int e = nums.length - 1;
		while (s < e) {
			int m = s + (e - s) / 2;
			if (nums[m] > nums[e])
				s = m + 1;
			else
				e = m;
		}
		return nums[s];
	}
}
