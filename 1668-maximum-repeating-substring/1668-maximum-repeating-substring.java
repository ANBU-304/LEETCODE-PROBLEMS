class Solution {
    public int maxRepeating(String sequence, String word) {
       int count = 0;
        String repeatedWord = word;
        
        while (sequence.contains(repeatedWord)) {
            count++;
            repeatedWord += word; 
        }
        
        return count;
    }
}