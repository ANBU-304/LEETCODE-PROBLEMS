class Solution {
    public int findKthPositive(int[] arr, int k) {
        int f[] = new int[arr[arr.length-1]+1+k];
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            f[arr[i]]++;
        }
        int j=1;
        while(count<k)
        {
            if(f[j]==0)
            {
                count++;
            }
            if(count==k)
            {
                return j;
            }
            j++;
        }

        return -1;

    }
}