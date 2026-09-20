class Solution {
    public int[] runningSum(int[] nums) {
        int i = 0;
        int sum = 0;
        while(i<nums.length){
            sum += nums[i];
            nums[i] = sum;
            i++;
        }
        return nums;
    }
}