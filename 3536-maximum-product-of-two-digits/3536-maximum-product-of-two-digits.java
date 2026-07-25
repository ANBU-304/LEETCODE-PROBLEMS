class Solution {
    public int maxProduct(int n) {
        int mul=1;
        int i=0;
        ArrayList<Integer> a = new ArrayList<>();
        while(n>0)
        {
            a.add(n%10);
            n/=10;
            i++;
        }
        Collections.sort(a);

        return a.get(i-1)*a.get(i-2);
    }
}