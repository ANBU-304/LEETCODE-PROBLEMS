class Solution {
    public int[] separateDigits(int[] nums) {
        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> a = new ArrayList<>();
        for(int num:nums)
        {
            int temp = num;
            while(temp>0)
            {
                s.push(temp%10);
                temp/=10;
            }
            while(!s.isEmpty())
            {
                a.add(s.pop());
            }
        }
        int[] arr = a.stream().mapToInt(Integer::intValue).toArray();
        return arr;

    }
}