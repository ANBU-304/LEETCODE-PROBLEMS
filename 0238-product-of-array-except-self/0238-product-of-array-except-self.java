class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int [] pro= new int [n];
        
        for(int i=0;i<n;i++){
            pro[i]=1;
        }
        int product=1;
        int product2=1;
        for(int i=0;i<n;i++){
            int j=n-1-i;
            pro[i]*=product;
            product*=nums[i];
            pro[j]*=product2;
            product2*=nums[j];
        }
       

return pro;
    }
}