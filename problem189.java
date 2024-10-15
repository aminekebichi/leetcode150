public class problem189 {
    public void rotate(int[] nums, int k) {
        if (k == 0) return;
        k = k % nums.length;

        // Step 1: Reverse the entire array
        reverse(nums, 0, nums.length - 1);

        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Step 3: Reverse the remaining elements from k to the end
        reverse(nums, k, nums.length - 1);
    }

    // Helper function to reverse the array in place between indices start and end
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
