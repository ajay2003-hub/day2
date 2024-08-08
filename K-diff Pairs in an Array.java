class Solution {
    public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0) {
            return 0;
        }
        
        Arrays.sort(nums);
        int count = 0;
        int left = 0;
        int right = 1;
        
        while (right < nums.length) {
            if (left == right || nums[right] - nums[left] < k) {
                right++;
            } else if (nums[right] - nums[left] > k) {
                left++;
            } else {
                count++;
                left++;
                right++;
                while (right < nums.length && nums[right] == nums[right - 1]) {
                    right++;
                }
            }
        }
        
        return count;
    }
}
