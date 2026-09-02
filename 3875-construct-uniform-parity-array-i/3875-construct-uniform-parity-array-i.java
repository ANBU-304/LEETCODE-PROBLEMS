class Solution {
    public boolean uniformArray(int[] nums1) {
     boolean odd = false;
     boolean even = false;
     int nums2[] = new int[nums1.length];

     for(int i=0;i<nums1.length;i++)
     {
        for(int j=i;j<nums1.length;j++)
        {
            if(i==j)
            nums2[j] = nums1[i];

            nums2[i] = nums1[i] - nums1[j];
        }
     } 
     for(int num:nums2)
     {
        if(num%2==0)
        {
            odd = true;
        }else
        {
            even = true;
        }
     }

     return even || odd;  
    }
}