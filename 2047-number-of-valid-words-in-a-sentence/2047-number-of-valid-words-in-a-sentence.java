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
        int hyphenCount = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (Character.isDigit(ch)) {
                return false;
            }

            switch (ch) {
                case '-':
                    hyphenCount++;

                    if (hyphenCount > 1) {
                        return false;
                    }

                    if (i == 0 || i == word.length() - 1) {
                        return false;
                    }

                    if (!Character.isLowerCase(word.charAt(i - 1))
                            || !Character.isLowerCase(word.charAt(i + 1))) {
                        return false;
                    }
                    break;

                case '!':
                case '.':
                case ',':
                    if (i != word.length() - 1) {
                        return false;
                    }
                    break;

                default:
                    if (!Character.isLowerCase(ch)) {
                        return false;
                    }
            }
        }

        return true;
    }
}