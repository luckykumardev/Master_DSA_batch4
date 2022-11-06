package class_07;
/*
 https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/
*/	
public class CapacityToShipPackagesWithinDDays {
	 public int shipWithinDays(int[] weights, int D) {
	        int low = 1, high = Integer.MAX_VALUE;
	        while (low <= high) {
	            int mid = (low + high) / 2;
	            boolean can = canShip(weights, D, mid);
	            if (can) {
	                high = mid - 1;
	            } else {
	                low = mid + 1;
	            }
	        }
	        return low;
	    }
	    
		private boolean canShip(int[] weights, int D, int capacity) {
	        int day = 1, w = 0;
	        for (int i = 0; i < weights.length; i++) {
	            if (weights[i] > capacity || day > D) return false;
	            if (w + weights[i] > capacity) {
	                w = weights[i];
	                day++;
	            } else {
	                w += weights[i];
	            }
	        }
	        return day <= D;
	    }
}
