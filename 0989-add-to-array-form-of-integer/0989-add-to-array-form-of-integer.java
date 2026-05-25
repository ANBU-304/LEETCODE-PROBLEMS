import java.util.*;
import java.math.BigInteger;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {

        String nums = "";

        for (int i = 0; i < num.length; i++) {
            nums += num[i];
        }

        BigInteger n = new BigInteger(nums);

        BigInteger ans = n.add(BigInteger.valueOf(k));

        ArrayList<Integer> a = new ArrayList<>();

        String b = ans.toString();

        for (int i = 0; i < b.length(); i++) {
            a.add(b.charAt(i) - '0');
        }

        return a;
    }
}