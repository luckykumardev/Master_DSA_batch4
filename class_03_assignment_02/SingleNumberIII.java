package class_03_assignment_02;
/*
 https://leetcode.com/problems/single-number-iii/
*/
public class SingleNumberIII {
	public int[] singleNumber(int[] nums) {
		int i = 0;
		int xor = 0;
		while (i < nums.length) {
			xor = xor ^ nums[i];
			i++;
		}
		i = 0;
		while (i < 32) {
			if (((xor >> i) & 1) == 1)
				break;
			else
				i++;
		}
		int arr[] = new int[2];
		int j = 0;
		while (j < nums.length) {
			if (((nums[j] >> i) & 1) == 0)
				arr[0] = arr[0] ^ nums[j];
			else
				arr[1] = arr[1] ^ nums[j];
			j++;
		}
		return arr;

	}
}
