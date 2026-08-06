class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        
        // Find first index of 0 or positive (negative count)
        int low = 0, high = n - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] >= 0)
                high = mid - 1;
            else
                low = mid + 1;
        }
        int negativeCount = low;
        
        // Find first index of positive
        low = 0;
        high = n - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] <= 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
        int positiveCount = n - low;
        
        return Math.max(negativeCount, positiveCount);
    }
}
