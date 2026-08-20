class Solution {

    public int search(int[] nums, int target) {

        int pivot = findPivot(nums);

        // Array is not rotated
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // Target is the pivot element
        if (nums[pivot] == target) {
            return pivot;
        }

        // Search in the left sorted half
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        // Search in the right sorted half
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    int findPivot(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Case 1: Pivot is at mid
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // Case 2: Pivot is before mid
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Search left half
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            }
            // Search right half
            else {
                start = mid + 1;
            }
        }

        return -1;
    }
}