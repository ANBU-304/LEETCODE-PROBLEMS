class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum=0;
        
        for (int i = 0; i < nums.size(); i++) {
            int count=0;
            for (int j = 0; j<32; j++) {
                if ((i & (1<<j)) != 0) {
                    count++;
                }
                
            }
            if (count == k) {
                    sum += nums.get(i);
                   
                }
                
        }
        return sum;
    }
}