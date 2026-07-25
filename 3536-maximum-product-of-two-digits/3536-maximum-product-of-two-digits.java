class Solution {
    public int maxProduct(int n) {
        char[] a = Integer.toString(n).toCharArray();
        int i = a.length;
        Arrays.sort(a);

        return (a[i-1]-'0')* (a[i-2]-'0');
    }
}