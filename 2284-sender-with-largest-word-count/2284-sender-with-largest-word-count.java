class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<messages.length;i++)
        {
            map.put(senders[i],map.getOrDefault(senders[i],0)+messages[i].split(" ").length);
        }

        int max = Integer.MIN_VALUE;
        String ans = null;
        for(Map.Entry<String,Integer> entry : map.entrySet())
        {
            String sender = entry.getKey();
            int count = entry.getValue();
            if(max<entry.getValue())
            {
                max = count;
                ans = sender;
            }
            else if(max == count && sender.compareTo(ans)>=0)
            {
                ans = sender;
            }
        }

        return ans;
    }
}