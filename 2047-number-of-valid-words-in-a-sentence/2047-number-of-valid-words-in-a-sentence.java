class Solution {
    public int countValidWords(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        int count = 0;

        for (String word : words) {
            if (word.length() > 0 && isValid(word)) {
                count++;
            }
        }

        return count;
    }

    private boolean isValid(String word) {
        int hyphen = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (Character.isDigit(ch))
                return false;

            if (ch == '-') {
                hyphen++;

                if (hyphen > 1)
                    return false;

                if (i == 0 || i == word.length() - 1)
                    return false;

                if (!Character.isLowerCase(word.charAt(i - 1)) ||
                    !Character.isLowerCase(word.charAt(i + 1)))
                    return false;
            }

            if (ch == '!' || ch == '.' || ch == ',') {
                if (i != word.length() - 1)
                    return false;
            }
        }

        return true;
    }
}