class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
      //  int min = Math.abs(drones[0][0] - target[0]) + Math.abs(drones[0][1]-target[1]);
      int min = Integer.MAX_VALUE;
        
        int ans =0;
        for(int i=0;i<drones.length;i++)
        {
            int temp = Math.abs(drones[i][0] - target[0]) + Math.abs(drones[i][1]-target[1]);

            if(temp<=drones[i][2])
            {
                if(temp<min)
                {
                    min = temp;
                    ans = i;
                }
            }
        }


        return min!=Integer.MAX_VALUE?ans:-1;
    }
}