class Solution {
    public int missingMultiple(int[] nums, int k) {

        for (int multiple = k; ; multiple += k) {

            int i;

            for (i = 0; i < nums.length; i++) {
                if (nums[i] == multiple) {
                    break;
                }
            }

            if (i == nums.length) {
                return multiple;
            }
        }
    }
}