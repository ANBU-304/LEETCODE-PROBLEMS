class Solution {
    public String toLowerCase(String s) {
        var chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            chars[i] = Character.toLowerCase(chars[i]);
        }
        return new String(chars);
    }
}