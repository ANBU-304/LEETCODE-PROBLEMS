class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int sortarr[] = arr.clone();
        Arrays.sort(sortarr);
        int nums[] = new int[arr.length];
        HashMap<Integer, Integer> m= new HashMap<>();
        int r = 1;
        for (int n : sortarr) {
            if (!m.containsKey(n)) {
                m.put(n, r++);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            nums[i] = m.get(arr[i]);
        }

        return nums;
    }
}