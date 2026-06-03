class Solution {
    public int smallestAbsent(int[] nums) {
        int sum=0;
        int a[] = new int[201];
        int n = nums.length;
        for(int i:nums){
            sum+=i;
            a[i+100]++;
        }
        int avg = (int)Math.ceil(sum/n);
        avg = (avg>0) ? avg:0;
        for(int i=avg+101;i<=200;i++){
            if(a[i]==0) return i-100;
        }
        return 101;
    }
}