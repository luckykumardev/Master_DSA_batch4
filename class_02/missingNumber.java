package class_02;
/*
 https://leetcode.com/problems/missing-number/
*/
public class missingNumber {
	public static void main(String[] args) {
	    int nums[] = {1, 0, 3, 4};
		int missing_num = 0;
		for (int i = 0; i <= nums.length-1; i++) {
			missing_num = missing_num ^ ((i+1) ^ (nums[i]));
		}

		System.out.println(missing_num);
	}

}
