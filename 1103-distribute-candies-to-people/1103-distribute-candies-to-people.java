class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] a = new int[num_people];
        int give = 1;
        int i = 0;

        while (candies > 0) {
            int idx = i % num_people;

            if (candies >= give) {
                a[idx] += give;
                candies -= give;
            } else {
                a[idx] += candies;
                candies = 0;
            }

            give++;
            i++;
        }

        return a;
    }
}
