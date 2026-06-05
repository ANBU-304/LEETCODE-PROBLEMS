class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int k=0;
        int count=0;
     if(s.length == 0)return 0;
        Thread t1 = new Thread(() -> {Arrays.sort(g);});
        Thread t2 = new Thread(() -> {Arrays.sort(s);});
        t1.start();
        t2.start();
        try {
        t1.join();
        t2.join();
        }
        catch(InterruptedException e) {
        }
        int i=0;
        while(i<g.length && k<s.length)
        {
            if(g[i]<=s[k])
            {
                count++;
                i++;
                k++;
            }
            else
            {
                k++;
            }
        }
        return count;
    }
}