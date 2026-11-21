
import java.util.Arrays;

class Solution {
    public void wiggleSort(int[] nums) {

        int n = nums.length;

        // Step 1: Sort the array
        int[] arr = nums.clone();
        Arrays.sort(arr);

        // Step 2: Find middle
        int mid = (n + 1) / 2;

        // Step 3: Fill the array from both halves
        int i = mid - 1;
        int j = n - 1;

        for (int k = 0; k < n; k++) {

            if (k % 2 == 0) {
                nums[k] = arr[i];
                i--;
            } else {
                nums[k] = arr[j];
                j--;
            }
        }
    }
}
