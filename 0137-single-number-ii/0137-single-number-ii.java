class Solution {
    public int singleNumber(int[] nums) {

        // Sort the array first
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i+=2) {

            if (nums[i] == nums[i + 1]) {
                i++;
            } else {
                return nums[i];
            }
        }

        return nums[nums.length - 1];
    }
}