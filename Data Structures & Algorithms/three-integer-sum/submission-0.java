class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums); // Sort the array first

        for (int i = 0; i < n; i++) {
            // Skip duplicates
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int target = -nums[i]; // Target is the negative of the current number
            int left = i + 1, right = n - 1; // Two pointers

            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum == target) {
                    // Found a triplet
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // Skip duplicates for the left pointer
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    // Skip duplicates for the right pointer
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    // Move the pointers
                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return res;
    }
}
