class Solution {
    public void rotate(int[] nums, int k) {
        int[] arr=new int [nums.length];
       

        if(k<0)
        return;

        k=k%(nums.length);
        int j=0;
        for(int i=k;i<nums.length;i++)
        {
            arr[i]=nums[j];
            j++;
        }
        for(int i=0;i<k;i++)
        {
            arr[i]=nums[j];
            j++;
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=arr[i];
        }


    }
}