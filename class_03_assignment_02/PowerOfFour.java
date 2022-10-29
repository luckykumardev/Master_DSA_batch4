package class_03_assignment_02;

/*
 https://leetcode.com/problems/power-of-four/
*/
public class PowerOfFour {
	public boolean isPowerOfFour(int n) {
		int i = 0;
		int count = 0;
		int p = n;
		boolean ans = false;
		if (n < 0 || n == 0)
			return false;
		else {
			while (n > 0) {
				n = n & (n - 1);
				count++;
			}
			System.out.println(count);
			if (count == 1) {
				while (i < 32) {
					if ((p & (~(1 << i))) == 0)
						break;
					else
						i++;
				}
				if (i % 2 == 0)
					ans = true;
				System.out.println(i);
			} else
				ans = false;
		}
		return ans;
	}
}
