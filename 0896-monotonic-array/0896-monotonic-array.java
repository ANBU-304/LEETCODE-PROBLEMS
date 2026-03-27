class Solution {
    public boolean isMonotonic(int[] nums) {

        if(incr(nums)) return true;
        if(decr(nums)) return true;
        return false;

        
        
    }
    public boolean incr(int[] nums){
        for(int i = 0 ; i< nums.length-1 ; i++){
            if(nums[i]>nums[i+1]) return false;
        }
        return true;
    }
    public boolean decr(int[] nums){
        for(int i = 0 ; i< nums.length-1 ; i++){
            if(nums[i]<nums[i+1]) return false;
        }
        return true;
    }

}