class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int s=0;
        int e=nums.length-1;
        int count=0;
        while(s < e){
            if((nums[s]+nums[e])==k){
                count++;
                s++;
                e--;
            }
            else if((nums[s]+nums[e]) < k){
                s++;
            }
            else{
                e--;
            }
        }
        return count;
        
    }
}
