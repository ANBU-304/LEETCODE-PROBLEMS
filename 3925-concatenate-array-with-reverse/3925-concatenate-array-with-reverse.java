class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n+n];
        int k=0;
        for(int i=0;i<n;i++)
        {
            arr[k]=nums[i];
            k++;
        }
        for(int i=n-1;i>=0;i--)
        {
            arr[k]=nums[i];
            k++;
        }

        return arr;
    }
}