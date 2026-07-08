class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int ans[] = new int[2];
        int count =0;
        int f[] = new int[101];

        for(int i=0;i<nums1.length;i++)
        {
            f[nums1[i]] = 1;
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(f[nums2[i]]==1)
            {
                count++;
            }
            
        }
        ans[1] = count;

        count =0;
         for(int i=0;i<101;i++)
        {
            f[i] = 0;
        }

        for(int i=0;i<nums2.length;i++)
        {
            f[nums2[i]] = 1;
        }

        for(int i=0;i<nums1.length;i++)
        {
            if(f[nums1[i]]==1)
            {
                count++;
            }
            
        }

        ans[0] = count;

        return ans;
    }
}