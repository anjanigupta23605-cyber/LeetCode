class Solution {
    public int minimumDeletions(int[] nums) {

        int minIndex = 0;
        int maxIndex = 0;

        // Find index of minimum and maximum
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }

            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }

        // Put smaller index in left
        int left = Math.min(minIndex, maxIndex);
        int right = Math.max(minIndex, maxIndex);

        int n = nums.length;

        // Three possible ways
        int fromLeft = right + 1;
        int fromRight = n - left;
        int fromBoth = (left + 1) + (n - right);

        return Math.min(fromLeft, Math.min(fromRight, fromBoth));
    }
}