class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int []target = new int[index.length];
        for(int i=0;i<index.length;i++)
        {
            target[i]=-1;
        }

        for(int i=0;i<index.length;i++)
        {
            if(target[index[i]]==-1)
            {
                target[index[i]]=nums[i];
            }else
            {
                int k=index.length-1;
                while(k>index[i])
                {
                    target[k]=target[k-1];
                    k--;
                
                }
                target[index[i]]=nums[i];
            }
        }

        return target;

    }
}