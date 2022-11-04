package class_07;
/*
 https://leetcode.com/problems/reverse-bits/description/
*/

public class ReverseBits {
	   public int reverseBits(int n) {
	        int ans=0;
	        int i=0;
	        while(i<32)
	        {
	            if((n&(1<<i))==0)
	                ans=ans&(~(1<<(31-i)));
	            else
	                ans=ans|((1<<(31-i)));

	            i++;
	        }
	        return ans;
	    }
}
