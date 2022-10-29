package class_03_assignment_02;
/*
 https://leetcode.com/problems/bitwise-and-of-numbers-range/	
*/

public class BitwiseANDOfNumbersRange {
	public int rangeBitwiseAnd(int left, int right) {
		int shift = 0;
		while (left < right) {
			left >>= 1;
			right >>= 1;
			++shift;
		}
		left = left << shift;
		return left;
	}
}
