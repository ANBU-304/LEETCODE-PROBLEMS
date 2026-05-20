import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
        int total=0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
           total+=nums[i]; 
        }
        int actotal=n*(n+1)/2;

        return actotal-total;


  
    }
}
