class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> list = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int m = intervals.length;
        for(int i=1;i<m;i++)
        {
            if(intervals[i-1][1]<intervals[i][0])
            {
                list.add(new int[]{intervals[i-1][0],intervals[i-1][1]});
            }
            else
            {
                
                intervals[i][0] = Math.min(intervals[i - 1][0], intervals[i][0]);
                intervals[i][1] = Math.max(intervals[i - 1][1], intervals[i][1]);
               
                
            }
        }

        list.add(new int[]{intervals[m - 1][0], intervals[m - 1][1]});

    int[][] array = list.toArray(new int[list.size()][]);
    return array;
    }
}