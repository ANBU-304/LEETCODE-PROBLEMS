class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
    Arrays.sort(seats);
    Arrays.sort(students);
    int sum=0;
    int k=0;
    for(int i=0;i<seats.length;i++)
    {
        sum+=Math.abs(seats[i]-students[k]);
        k++;
    }
    return sum;
    }
}