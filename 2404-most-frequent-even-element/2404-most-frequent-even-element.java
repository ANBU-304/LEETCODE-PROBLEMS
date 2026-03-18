import java.util.*;

class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int maxFreq = 0;
        int result = -1;

        for (int num : nums) {
            if (num % 2 == 0) {
                int freq = map.getOrDefault(num, 0) + 1;
                map.put(num, freq);

           
                if (freq > maxFreq || (freq == maxFreq && num < result)) {
                    maxFreq = freq;
                    result = num;
                }
            }
        }

        return result;
    }
}