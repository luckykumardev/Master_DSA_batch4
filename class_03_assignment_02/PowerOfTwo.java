package class_03_assignment_02;
/*
 https://leetcode.com/problems/power-of-two/	
*/

public class PowerOfTwo {
	public boolean isPowerOfTwo(int n) {
		if (n < 0)
			return false;
		else if (n == 0)
			return false;
		else {
			n = n & (n - 1);
			if (n == 0)
				return true;
			else
				return false;
		}
	}
}
