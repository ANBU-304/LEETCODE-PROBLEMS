class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        int c=n/2;
       HashSet<Integer> a = new HashSet<>();
for(int t : candyType){
    a.add(t);
}
        
        return Math.min(c,a.size());

    }
}