class Solution {
    public String longestWord(String[] words) {
Arrays.sort(words);
        HashSet<String> set = new HashSet<>();

        String answer = "";

        for(int i = 0; i < words.length; i++) {

            String word = words[i];

            // Single character word
            if(word.length() == 1) {
                set.add(word);

                if(answer.length() < 1) {
                    answer = word;
                }

                continue;
            }

            // Check previous prefix
            String prefix = word.substring(0, word.length() - 1);

            if(set.contains(prefix)) {

                set.add(word);

                if(word.length() > answer.length()) {
                    answer = word;
                }
            }
        }

        return answer; 
    }
}