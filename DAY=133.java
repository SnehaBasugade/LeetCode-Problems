class Solution {
    public int[] sortedSquares(int[] nums) {

        // Step 1: Square each element
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        // Step 2: Apply Selection Sort
        for (int i = 0; i < nums.length - 1; i++) {

            int minIndex = i;

            // Find the smallest element
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }

        return nums;
    }
}