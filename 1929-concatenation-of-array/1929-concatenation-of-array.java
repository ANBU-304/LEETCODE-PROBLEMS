class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int i;
        int j=0;
        int[] array = new int[n+n];
        for( i=0;i<n;i++)
        {
            array[i]=nums[i];
        }
            for( i=n;i<n+n;i++)
        {
            array[i]=nums[j];
            j++;
        }
        
        return array;

    }
}